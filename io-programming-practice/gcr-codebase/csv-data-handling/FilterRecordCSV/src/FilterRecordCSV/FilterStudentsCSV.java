package FilterRecordCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStudentsCSV {
    public static void main(String[] args) {
        String filePath= "student.csv";
        boolean isHeader= true;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);
                // Filter condition
                if (marks > 80) {
                    System.out.println("ID    : " + id);
                    System.out.println("Name  : " + name);
                    System.out.println("Age   : " + age);
                    System.out.println("Marks : " + marks);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
