import java.util.Scanner;

public class FactorArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number= scan.nextInt();

        int maxSize= 10;
        int[] factor= new int[maxSize];
        int index= 0;

        for (int i= 1; i<= number;i++) {
            if (number % i== 0) {
                if (index== maxSize) {
                    maxSize*= 2;
                    int[] temp= new int[maxSize];
                    System.arraycopy(factor, 0, temp, 0, factor.length);
                    factor= temp;
                }
                factor[index++]= i;
            }
        }
        for (int i= 0; i< index;i++)
            System.out.print(factor[i]+ " ");
    }
}
