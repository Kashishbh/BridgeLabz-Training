public class FibonacciComputation{
    // Recursive Fibonacci
    static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    // Iterative Fibonacci
    static int fibonacciIterative(int n) {
        int a= 0, b= 1, sum= 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return n == 0 ? 0 : b;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Recursive: " + fibonacciRecursive(n));
        System.out.println("Iterative: " + fibonacciIterative(n));
    }
}
