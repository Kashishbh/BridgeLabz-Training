import java.util.Scanner;
class WhileFactorial {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        if (num>0) {
            int fact = 1;
            int i = 1;
            while (i<= num) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial = " + fact);
        }
    }
}
