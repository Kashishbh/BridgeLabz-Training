import java.util.Scanner;
public class EvenOddArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        if (num<= 0) {
            System.out.println("Invalid Natural Number");
            return;
        }
        int[] evennum= new int[num/ 2 + 1];
        int[] oddnum= new int[num/ 2 + 1];
        int even= 0, odd= 0;
        for (int i= 1;i<= num; i++) {
            if (i%2 == 0)
                evennum[even++] = i;
            else
                oddnum[odd++] = i;
        }
        System.out.println("Odd Numbers:");
        for (int i = 0; i < odd; i++)
            System.out.print(oddnum[i] + " ");

        System.out.println("\nEven Numbers:");
        for (int i = 0; i < even; i++)
            System.out.print(evennum[i] + " ");
    }
}

