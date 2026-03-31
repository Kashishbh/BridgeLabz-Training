import java.io.BufferedReader;
import java.io.FileReader;

public class CountOccurrence {

    public static void main(String[] args) {

        String targetWord = "Java";  
        int count = 0;

        try {
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("Occurrence of '" + targetWord + "': " + count);

            br.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
