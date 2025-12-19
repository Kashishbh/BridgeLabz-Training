import java.util.Scanner;
class FactorWhile {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        int i = 1;
        if (num>0) {
            while (i<num) {
                if (num%i==0)
                    System.out.println(i);
                i++;
            }
        }
    }
}
