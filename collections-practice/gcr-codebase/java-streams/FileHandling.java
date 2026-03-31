//Read and Write a Text File
import java.io.*;
public class FileHandling {
    public static void main(String[] args) {
        File sourceFile = new File("input.txt");
        File destinationFile = new File("destination.txt");
        // Check if source file exists
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }
        // Try-with-resources ensures streams are closed automatically
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while reading or writing the file.");
            e.printStackTrace();
        }
    }
}
