import java.util.Scanner;
public class LargestDigitArray{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        int maxDigit= 10;
        int[] digit= new int[maxDigit];
        int index= 0;
        while (num!= 0 && index< maxDigit) {
            digit[index++] = num% 10;
            num/= 10;
        }
        int largest = 0, secondLargest = 0;
        for (int i = 0; i< index; i++) {
            if (digit[i]>largest) {
                secondLargest = largest;
                largest= digit[i];
            } else if (digit[i]>secondLargest && digit[i]!= largest) {
                secondLargest= digit[i];
            }
        }
        System.out.println("Largest = " +largest);
        System.out.println("Second Largest = " +secondLargest);
    }
}
