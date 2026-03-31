import java.util.Scanner;

public class StringArrayEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }
        for (String s : word2) {
            sb2.append(s);
        }

        return sb1.toString().equals(sb2.toString());
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number of strings in word1: ");
        int n1 = scan.nextInt();
        scan.nextLine();

        String[] word1 = new String[n1];
        System.out.println("Enter strings for word1:");
        for (int i = 0; i < n1; i++) {
            word1[i] = scan.nextLine();
        }
        System.out.print("Enter number of strings in word2: ");
        int n2 = scan.nextInt();
        scan.nextLine();
        String[] word2 = new String[n2];
        System.out.println("Enter strings for word2:");
        for (int i = 0; i < n2; i++) {
            word2[i] = scan.nextLine();
        }
        boolean result = arrayStringsAreEqual(word1, word2);
        System.out.println("Are both arrays equivalent? " + result);
    }
}
