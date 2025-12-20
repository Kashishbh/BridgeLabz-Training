import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num>0) {
            for (int i=1;i<=num;i++) {
                if (i%2== 0)
                    System.out.println(i+" is Even");
                else
                    System.out.println(i+" is Odd");
            }
        }
    }
}
