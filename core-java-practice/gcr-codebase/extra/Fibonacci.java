import java.util.Scanner;
class Fibonacci{
    static void printFibonacci(int n) {
        int a = 0, b = 1;
        if (n <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = scan.nextInt();
        printFibonacci(terms);
    }
}
