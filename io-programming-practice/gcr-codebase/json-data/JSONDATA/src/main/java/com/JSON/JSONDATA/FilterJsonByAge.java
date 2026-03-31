package com.JSON.JSONDATA;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;
public class FilterJsonByAge {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        //Read JSON array
        JsonNode rootNode = mapper.readTree(new File("users.json"));
        //Loop through records
        for (JsonNode node : rootNode) {
            int age = node.get("age").asInt();
            //Apply filter condition
            if (age > 25) {
                System.out.println("Name: " + node.get("name").asText() + ", Age: " + age +", Email: " + node.get("email").asText());
            }
        }
    }
}
