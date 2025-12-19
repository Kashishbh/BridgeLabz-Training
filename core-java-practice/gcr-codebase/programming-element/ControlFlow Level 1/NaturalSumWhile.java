import java.util.Scanner;

class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 0) {
            int sum = 0, i = 1;
            while (i<=num) {
                sum += i;
                i++;
            }
            int formula = num*(num+1)/2;
            System.out.println("While Loop Sum= "+sum);
            System.out.println("Formula Sum= "+formula);
        }
    }
}
