import java.util.Scanner;
public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scan.nextLine();
        int[] indices = new int[s.length()];
        System.out.println("Enter indices:");
        for (int i = 0; i < s.length(); i++) {
            indices[i] = scan.nextInt();
        }
        String output = restoreString(s, indices);
        System.out.println("Shuffled String: " + output);
    }
}
