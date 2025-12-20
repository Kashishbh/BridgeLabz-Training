import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        int originalNum= num;
        int sum= 0;
        while (num!= 0) {
            int digit = num% 10;
            sum+=digit*digit* digit;
            num=num/10;
        }
        if (sum==originalNum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
