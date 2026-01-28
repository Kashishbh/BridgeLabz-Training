package LexicalTwist;
import java.util.*;
public class LexicalTwist {
    public static boolean isSingleWord(String s) {
        return !s.contains(" ");
    }
    public static boolean isReverse(String first, String second) {
        return new StringBuilder(first.toLowerCase()).reverse().toString().equals(second.toLowerCase());
    }
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the first word");
        String first = scan.nextLine().trim();
        if (!isSingleWord(first)) {
            System.out.println(first + " is an invalid word");
            return;
        }
        System.out.println("Enter the second word");
        String second = scan.nextLine().trim();
        if (!isSingleWord(second)) {
            System.out.println(second + " is an invalid word");
            return;
        }
        // CASE 1: second word is reverse of first word
        if (isReverse(first, second)) {
            // reverse first word
            String reversed= new StringBuilder(first).reverse().toString();
            // lowercase
            reversed= reversed.toLowerCase();
            //  replace vowels with '@'
            reversed= reversed.replaceAll("[aeiou]", "@");
            System.out.println(reversed);
        }

        // CASE 2: second word is NOT reverse of first word
        else {
            // Step 1: combine first + second
            String combined = (first + second).toUpperCase();
            // Step 2: count vowels & consonants
            int vowelCount = 0, consonantCount = 0;
            for (char c : combined.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (isVowel(c)) vowelCount++;
                    else consonantCount++;
                }
            }
            // Step 3 & 4: based on counts
            if (vowelCount > consonantCount) {
                // print first 2 unique vowels
                HashSet<Character> vowels = new HashSet<>();
                for (char c : combined.toCharArray()) {
                    if (isVowel(c)) vowels.add(c);
                    if (vowels.size() == 2) break;
                }
                for (char c : vowels) System.out.print(c);
            }
            else if (consonantCount >vowelCount) {
                // print first 2 unique consonants
                HashSet<Character> cons = new HashSet<>();
                for (char c : combined.toCharArray()) {
                    if (Character.isLetter(c) && !isVowel(c)) cons.add(c);
                    if (cons.size() == 2) break;
                }
                for (char c : cons) System.out.print(c);
            }
            else {
                System.out.println("Vowels and consonants are equal");
                return;
            }
        }
    }
}