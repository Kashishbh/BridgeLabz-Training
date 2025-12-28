import java.util.Scanner;
class FactorialUsingRecursion {
    static int getInput(Scanner scan) {
        System.out.print("Enter a number: ");
        return scan.nextInt();
    }
    static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
    static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " is: " + result);
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num= getInput(scan);
        if (num< 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(num);
            displayResult(num, result);
        }
    }
}
