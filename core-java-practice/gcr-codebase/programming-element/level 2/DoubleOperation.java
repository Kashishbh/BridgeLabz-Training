import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextDouble();
        int val2 = sc.nextDouble();
        int val3 = sc.nextDouble();
        double result1 = val1 + val2 * val3;
        double result2 = val1 * val2 + val3;
        double result3 = val3 + val1 / val2;
        double result4 = val1 % val2 + val3;

        System.out.println("The results of Double Operations are "
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}

