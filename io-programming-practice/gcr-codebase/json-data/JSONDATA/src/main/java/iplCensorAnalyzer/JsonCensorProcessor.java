package iplCensorAnalyzer;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
public class JsonCensorProcessor {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper=new ObjectMapper();
        // Read JSON array
        JsonNode rootArray=mapper.readTree(new File("ipl.json"));
        for (JsonNode match : rootArray) {
            ObjectNode obj = (ObjectNode) match;
            // Mask teams
            obj.put("team1", CensorUtil.maskTeamName(obj.get("team1").asText()));
            obj.put("team2", CensorUtil.maskTeamName(obj.get("team2").asText()));
            obj.put("winner", CensorUtil.maskTeamName(obj.get("winner").asText()));
            // Redact player of match
            obj.put("player_of_match", CensorUtil.redactPlayer());
        }
        // Write censored JSON
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File("ipl_censored.json"), rootArray);
        System.out.println("Censored JSON generated");
    }
}
