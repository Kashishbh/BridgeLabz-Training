import java.util.Scanner;
public class ParagraphAnalyzer{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String paragraph = scan.nextLine();
        System.out.println("Enter the word to replace:");
        String wordToReplace = scan.nextLine();
        System.out.println("Enter the replacement word:");
        String replacementWord = scan.nextLine();
        analyzeParagraph(paragraph, wordToReplace, replacementWord);
    }
    private static void analyzeParagraph(String paragraph, String target, String replacement) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("The paragraph is empty or contains only spaces.");
            return;
        }
        String[] words = paragraph.trim().split("\\s+");
        System.out.println("Word Count: " + words.length);
        String longestWord = "";
        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            if (cleanWord.length() > longestWord.length()) {
                longestWord = cleanWord;
            }
        }
        System.out.println("Longest Word: " + longestWord);
        String updatedParagraph =paragraph.replaceAll("(?i)\\b" + target + "\\b", replacement);
        System.out.println("Updated Paragraph:");
        System.out.println(updatedParagraph);
    }
}
