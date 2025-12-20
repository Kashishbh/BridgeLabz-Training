import java.util.Scanner;

class SumWithWhileBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double num = scan.nextDouble();
            if (num<= 0)
                break;
            total+= num;
        }
        System.out.println("Sum= " + total);
    }
}
