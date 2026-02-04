package com.JSON.JSONDATA;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
public class JsonToXml {
    public static void main(String[] args) throws Exception {
        ObjectMapper jsonMapper=new ObjectMapper();
        // Read JSON file
        JsonNode jsonNode = jsonMapper.readTree(new File("user.json"));
        // Convert JSON to XML
        XmlMapper xmlMapper=new XmlMapper();
        String xml=xmlMapper.writerWithDefaultPrettyPrinter()
                              .writeValueAsString(jsonNode);
        System.out.println(xml);
    }
}
