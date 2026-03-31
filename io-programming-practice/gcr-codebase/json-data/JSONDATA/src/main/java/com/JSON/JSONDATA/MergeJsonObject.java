package com.JSON.JSONDATA;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
public class MergeJsonObject {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper=new ObjectMapper();
        // First JSON object
        ObjectNode json1 = mapper.createObjectNode();
        json1.put("name", "Kashish");
        json1.put("email", "kashish@gmail.com");
        // Second JSON object
        ObjectNode json2 = mapper.createObjectNode();
        json2.put("age", 20);
        json2.put("city", "Agra");
        // Merge json2 into json1
        json1.setAll(json2);
        // Print merged JSON
        System.out.println( mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json1));
    }
}
