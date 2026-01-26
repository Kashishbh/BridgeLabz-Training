import java.io.*;
import java.util.*;

public class CountWords{

    public static void main(String[] args) {

        File file = new File("input.txt");

        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        // HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // -------- Reading File --------
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Convert to lowercase & remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z ]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word,
                                wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------- Sorting by Frequency --------
        List<Map.Entry<String, Integer>> wordList =
                new ArrayList<>(wordCountMap.entrySet());

        wordList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // -------- Display Top 5 --------
        System.out.println("Top 5 most frequent words:");
        int limit = Math.min(5, wordList.size());

        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = wordList.get(i);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
