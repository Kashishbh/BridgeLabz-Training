import java.util.Scanner;
class Fizz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (i%3==0 && i%5== 0)
                    System.out.println("FizzBuzz");
                else if (i%3==0)
                    System.out.println("Fizz");
                else if (i%5==0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
            }
        }
    }
}
