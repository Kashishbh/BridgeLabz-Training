package WriteCSV;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData{

    public static void main(String[] args) {

        String filePath = "employees.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            // Write header
            writer.write("ID,Name,Department,Salary");
            writer.newLine();

            // Write employee records
            writer.write("1,Ron,Engineering,60000");
            writer.newLine();

            writer.write("2,Susane,HR,55000");
            writer.newLine();

            writer.write("3,Kiona,Marketing,58000");
            writer.newLine();


            System.out.println("Employee CSV file created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
