import java.util.Scanner;
class PrimeNum{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        boolean Prime = true;
        if (num<= 1) {
            Prime=false;
        } else {
            for (int i=2;i<num;i++) {
                if (num%i==0) {
                    Prime=false;
                    break;
                }
            }
        }
        if (Prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}
