import java.util.Scanner;
public class CheckNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] number = new int[5];
        for (int i= 0;i<number.length;i++) {
            System.out.print("Enter number "+(i + 1)+": ");
            number[i] = scan.nextInt();
        }
        for (int num: number) {
            if (num> 0) {
                System.out.print(num + " is Positive and ");
                System.out.println(num % 2 == 0 ? "Even" : "Odd");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Zero");
            }
        }
        if (number[0] == number[number.length - 1])
            System.out.println("First and Last elements are Equal");
        else if (number[0] > number[number.length - 1])
            System.out.println("First element is Greater");
        else
            System.out.println("Last element is Greater");
    }
}

