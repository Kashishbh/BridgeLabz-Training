class PalindromeChecker {
    private String text;
    public PalindromeChecker(String text) {
        this.text = text;
    }
    public boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int n = cleanText.length();
        for (int i = 0; i < n / 2; i++) {
            if (cleanText.charAt(i) != cleanText.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }
}
public class PalindromeString{
    public static void main(String[] args) {
        PalindromeChecker pc1 = new PalindromeChecker("A man a plan a canal Panama");
        PalindromeChecker pc2 = new PalindromeChecker("Hello");
        pc1.displayResult();
        pc2.displayResult();
    }
}
