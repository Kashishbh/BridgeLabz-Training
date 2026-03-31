package com.JSON.JSONDATA;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
public class ValidateJson {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            //Read JSON 
            JsonNode rootNode = mapper.readTree(new File("user.json"));
            // Validate required fields
            if (!rootNode.has("name") ||
                !rootNode.has("age") ||
                !rootNode.has("email")) {
                System.out.println("Missing required fields");
                return;
            }
            // Validate data types
            if (!rootNode.get("name").isTextual() ||
                !rootNode.get("age").isInt() ||
                !rootNode.get("email").isTextual()) {
                System.out.println("Incorrect data types");
                return;
            }
            System.out.println("JSON format is valid");
        } catch (Exception e) {
            System.out.println("Invalid JSON format");
        }
    }
}
