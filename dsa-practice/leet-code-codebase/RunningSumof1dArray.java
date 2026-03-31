import java.util.Scanner;

public class RunningSumof1dArray {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        int[] result = runningSum(nums);

        System.out.print("Running Sum Array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
