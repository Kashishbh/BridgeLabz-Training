package ReadCountCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSV {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        int recordCount = 0;
        boolean isHeader = true;
        try (BufferedReader br= new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line= br.readLine()) != null) {
                // Skip header row
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                recordCount++;
            }
            System.out.println("Total Records (excluding header): " + recordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
