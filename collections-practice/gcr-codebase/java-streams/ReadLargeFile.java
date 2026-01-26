import java.io.*;
import java.nio.charset.StandardCharsets;
public class ReadLargeFile{
    public static void main(String[] args) {
        File file = new File("largefile.txt");
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }
        try (
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file),
                            StandardCharsets.UTF_8))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                // Case-insensitive check
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
