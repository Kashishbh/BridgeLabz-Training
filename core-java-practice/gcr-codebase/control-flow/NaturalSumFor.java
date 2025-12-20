import java.util.Scanner;
class NaturalSumFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num>0) {
            int sum=0;
            for (int i=1;i<=num;i++) {
                sum+= i;
            }
            int formula = num *(num + 1)/2;
            System.out.println("For Loop Sum = "+sum);
            System.out.println("Formula Sum = "+formula);
        }
    }
}

