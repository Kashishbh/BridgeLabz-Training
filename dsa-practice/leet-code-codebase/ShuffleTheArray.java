import java.util.Scanner;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = scan.nextInt();

        int[] nums = new int[2 * n];
        System.out.println("Enter " + (2 * n) + " elements:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = scan.nextInt();
        }

        int[] result = shuffle(nums, n);

        System.out.print("Shuffled Array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
