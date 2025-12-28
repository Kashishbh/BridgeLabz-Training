import java.util.Scanner;
class PalindromeChecker{
    static String getInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println(str +" is a Palindrome");
        } else {
            System.out.println( str +" is NOT a Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String input = getInput(scan);
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}
