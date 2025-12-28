import java.util.Scanner;
class GCDAndLCM{
    static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);
        System.out.println("GCD of " +num1+ " and "+num2+ " is: "+gcd);
        System.out.println("LCM of " +num1+ " and "+num2+ " is: "+lcm);
    }
}
