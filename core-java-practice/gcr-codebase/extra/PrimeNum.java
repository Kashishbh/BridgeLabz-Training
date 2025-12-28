import java.util.Scanner;
class PrimeNum{
    static boolean isPrime(int num) {
        if (num<= 1)
            return false;
        for (int i= 2; i * i <= num; i++) {
            if (num% i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }
}
