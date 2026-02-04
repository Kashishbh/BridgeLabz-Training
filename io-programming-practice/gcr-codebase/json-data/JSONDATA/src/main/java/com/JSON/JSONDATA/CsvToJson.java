package com.JSON.JSONDATA;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.util.List;
import java.util.Map;
public class CsvToJson {
    public static void main(String[] args) throws Exception {
        //Create CSV mapper
        CsvMapper csvMapper=new CsvMapper();
        // Define schema with header
        CsvSchema schema=CsvSchema.emptySchema().withHeader();
        // Step 3: Read CSV into List of Maps
        MappingIterator<Map<String, String>> iterator=csvMapper.readerFor(Map.class).with(schema).readValues(new File("users.csv"));
        List<Map<String, String>> data = iterator.readAll();
        // Step 4: Convert to JSON
        ObjectMapper jsonMapper = new ObjectMapper();
        String json = jsonMapper.writerWithDefaultPrettyPrinter()
                                .writeValueAsString(data);
        System.out.println(json);
    }
}
