//Convert Uppercase to Lowercase

import java.io.*;
import java.nio.charset.StandardCharsets;
public class FilterStreams  {

    public static void main(String[] args) {

        File sourceFile = new File("input.txt");
        File targetFile = new File("output.txt");

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        try (
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(sourceFile),
                            StandardCharsets.UTF_8));

            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(targetFile),
                            StandardCharsets.UTF_8))
        ) {

            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();
            }

            System.out.println("Uppercase letters converted to lowercase successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
