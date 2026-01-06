import java.util.Scanner;
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n = scan.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = scan.nextInt();
        }
        int[] result = plusOne(digits);
        System.out.print("Result after plus one: ");
        for (int d : result) {
            System.out.print(d + " ");
        }
    }
}
