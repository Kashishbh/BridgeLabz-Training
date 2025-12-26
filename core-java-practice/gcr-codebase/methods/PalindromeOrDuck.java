import java.util.Arrays;
public class PalindromeOrDuck {
    public static int countDigits(int num) {
        num= Math.abs(num);
        if (num== 0) return 1;
        int count = 0;
        while (num> 0) {
            count++;
            num/= 10;
        }
        return count;
    }
    public static int[] getDigits(int num) {
        num= Math.abs(num);
        int n = countDigits(num);
        int[] digits = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = num% 10;
            num= 10;
        }
        return digits;
    }
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - i - 1];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static boolean isPalindrome(int number) {
        int[] digits= getDigits(number);
        int[] reversed= reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num= 12321;
        System.out.println("Number: " + num);
        System.out.println("Count of digits: " + countDigits(num));
        int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));
        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversed));
        boolean arraysEqual = areArraysEqual(digits, reversed);
        System.out.println("Digits and reversed digits equal: " + arraysEqual);
        boolean palindrome = isPalindrome(num);
        System.out.println("Is Palindrome: " + palindrome);
        boolean duck = isDuckNumber(num);
        System.out.println("Is Duck Number: " + duck);
    }
}
