import java.io.*;

public class FileReadingEfficiency {

    public static void main(String[] args) {

        String fileName = "input.txt"; // file must be in project root

        try {
            // FileReader (Character Stream)
            FileReader fr = new FileReader(fileName);
            while (fr.read() != -1) {
                // reading character by character
            }
            fr.close();

            // InputStreamReader (Byte Stream)
            InputStreamReader isr =
                    new InputStreamReader(new FileInputStream(fileName));
            while (isr.read() != -1) {
                // reading bytes and converting to characters
            }
            isr.close();

            System.out.println("File reading completed successfully");

        } catch (FileNotFoundException e) {
            System.out.println("input.txt not found. Please place it in project directory.");
        } catch (IOException e) {
            System.out.println("Error occurred while reading the file.");
        }
    }
}
