package com.JSON.JSONDATA;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJSON {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name", "Kashish Bhatnagar");
        student.put("age", 22);
        JSONArray subjects = new JSONArray();
        subjects.put("Java");
        subjects.put("Python");
        subjects.put("Web Development");
        student.put("subjects", subjects);
        System.out.println(student.toString(2));
    }
}
