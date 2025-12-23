import java.util.Scanner;
public class Palindrome3Logic{
    // LOGIC 1: Using loop (start & end comparison)
    static boolean PalindromeLoop(String text) {
        int start= 0;
        int end= text.length() - 1;
        while (start< end) {
            if(text.charAt(start)!= text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    // LOGIC 2: Using recursion
    static boolean PalindromeRecursive(String text, int start, int end) {
        if (start>= end)
            return true;
        if (text.charAt(start)!= text.charAt(end))
            return false;
        return PalindromeRecursive(text, start + 1, end - 1);
    }
    // Method to reverse string using charAt()
    static char[] reverseString(String text) {
        int length= text.length();
        char[] reverse= new char[length];
        int index= 0;
        for (int i= length - 1; i>= 0;i--) {
            reverse[index]= text.charAt(i);
            index++;
        }
        return reverse;
    }
    // LOGIC 3: Using character arrays
    static boolean PalindromeArray(String text) {
        char[] orig= text.toCharArray();
        char[] rev= reverseString(text);
        for (int i= 0; i< orig.length;i++) {
            if (orig[i]!= rev[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter text: ");
        String text= scan.nextLine();
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1: " +
                (PalindromeLoop(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2: " +
                (PalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3: " +
                (PalindromeArray(text) ? "Palindrome" : "Not Palindrome"));

    }
}
