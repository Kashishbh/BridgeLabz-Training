import java.util.Scanner;
public class CompareSubString {
    static String substringCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
    static boolean compareString(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter text: ");
        String text= scan.next();
        System.out.print("Enter start index: ");
        int startInd= scan.nextInt();
        System.out.print("Enter end index: ");
        int endInd= scan.nextInt();
        String userSubStr= substringCharAt(text, startInd, endInd);
        String builtInSubStr= text.substring(startInd, endInd);
        System.out.println("User substring: "+userSubStr);
        System.out.println("Built-in substring: "+builtInSubStr);
        System.out.println("Comparison Result: "+compareString(userSubStr, builtInSubStr));
    }
}
