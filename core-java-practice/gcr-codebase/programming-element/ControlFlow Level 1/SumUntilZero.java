import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0.0;
        double num;
        while ((num=scan.nextDouble()) != 0) {
            total += num;
        }
        System.out.println("Sum= " + total);
    }
}
