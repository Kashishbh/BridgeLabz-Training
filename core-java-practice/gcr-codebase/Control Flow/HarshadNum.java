import java.util.Scanner;
class HarshadNum{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        int temp= num;
        int sum= 0;
        while (temp!=0) {
            sum+= temp%10;
            temp= temp/10;
        }
        if (num%sum==0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
    }
}
