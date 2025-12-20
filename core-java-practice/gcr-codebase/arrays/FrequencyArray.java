import java.util.Scanner;
public class FrequencyArray{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        int[] freq= new int[10];
        while (num!= 0) {
            freq[num%10]++;
            num/=10;
        }
        for (int i= 0; i< 10;i++)
            System.out.println("Digit " + i + " = " + freq[i]);
    }
}

