package JavaCollectors;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "Learning is a continuous process that improves both knowledge and confidence. Small efforts made consistently lead to meaningful progress over time.";
        // convert to lowercase and remove punctuation
        Pattern pattern = Pattern.compile("[^a-zA-Z ]"); // Matches anything that is not a letter or a space
        String normalizedText = pattern.matcher(paragraph).replaceAll("").toLowerCase();
        // Split text into words and count frequencies using Collectors.toMap()
        Map<String, Long> wordFrequencies = Arrays.stream(normalizedText.split("\s+"))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toMap(
                        Function.identity(), // Key is the word itself
                        word -> 1L,          // Initial value is 1
                        Long::sum            // Merge function for duplicate keys (sum counts)
                ));
        System.out.println("Word Frequencies:");
        wordFrequencies.forEach((word, count) ->
                System.out.println(word + " -> " + count)
        );
    }
}