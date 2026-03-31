package iplCensorAnalyzer;

import com.fasterxml.jackson.dataformat.csv.*;
import com.fasterxml.jackson.databind.MappingIterator;

import java.io.File;
import java.util.*;

import com.fasterxml.jackson.dataformat.csv.*;
import com.fasterxml.jackson.databind.MappingIterator;

import java.io.File;
import java.util.*;

public class CsvCensorProcessor {

    public static void main(String[] args) throws Exception {

        CsvMapper mapper = new CsvMapper();

        // READ schema (header present in input CSV)
        CsvSchema readSchema = CsvSchema.emptySchema().withHeader();

        MappingIterator<Map<String, String>> iterator =
                mapper.readerFor(Map.class)
                      .with(readSchema)
                      .readValues(new File("ipl.csv"));

        List<Map<String, String>> censoredData = new ArrayList<>();

        while (iterator.hasNext()) {
            Map<String, String> row = iterator.next();

            row.put("team1", CensorUtil.maskTeamName(row.get("team1")));
            row.put("team2", CensorUtil.maskTeamName(row.get("team2")));
            row.put("winner", CensorUtil.maskTeamName(row.get("winner")));
            row.put("player_of_match", CensorUtil.redactPlayer());

            censoredData.add(row);
        }

        // WRITE schema (explicit column names REQUIRED)
        CsvSchema writeSchema = CsvSchema.builder()
                .addColumn("match_id")
                .addColumn("team1")
                .addColumn("team2")
                .addColumn("score_team1")
                .addColumn("score_team2")
                .addColumn("winner")
                .addColumn("player_of_match")
                .setUseHeader(true)
                .build();

        mapper.writer(writeSchema)
              .writeValue(new File("ipl_censored.csv"), censoredData);

        System.out.println(" Censored CSV generated successfully");
    }
}

