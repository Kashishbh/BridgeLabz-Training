import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] table = new int[10];
        for (int i=1;i<= 10;i++) {
            table[i-1] = num*i;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" * "+i+" = " + table[i - 1]);
        }
    }
}
