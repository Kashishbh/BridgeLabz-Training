
import java.util.Scanner;

class ReturnCharacter{
    static char[] getChar(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }
    static boolean compareArray(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scan.nextLine();
        char[] userArray = getChar(text);
        char[] builtInArray = text.toCharArray();
        System.out.println("Comparison Result: " + compareArray(userArray, builtInArray));
    }
}
