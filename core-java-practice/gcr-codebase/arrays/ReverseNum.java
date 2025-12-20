import java.util.Scanner;
public class ReverseNum{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int temp = num, count = 0;
        while (temp > 0) {
            count++;
            temp/= 10;
        }
        int[] digit= new int[count];
        for (int i = 0; i < count; i++) {
            digit[i] = num% 10;
            num/= 10;
        }
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++)
            System.out.print(digit[i]);
    }
}
