import java.util.Scanner;

public class LengthWithoutLength {
    // finding the length without using length() function
    static int findLen(String str) {
        int count= 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text= scan.next();
        int Length= findLen(text);
        int builtInLength= text.length();
        System.out.println("Length without using InBuilt method: " + Length);
        System.out.println("Length using length(): " + builtInLength);
    }
}
