import java.util.Scanner;
class MaxOfThree{
    static int[] takeInput(Scanner scan) {
        int[] num= new int[3];
        System.out.print("Enter first number: ");
        num[0] = scan.nextInt();
        System.out.print("Enter second number: ");
        num[1] = scan.nextInt();
        System.out.print("Enter third number: ");
        num[2] = scan.nextInt();
        return num;
    }
    static int findMaximum(int[] nums) {
        int max = nums[0];
        if (nums[1] > max)
            max = nums[1];
        if (nums[2] > max)
            max = nums[2];
        return max;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] num= takeInput(scan);
        int max= findMaximum(num);
        System.out.println("Maximum number is: "+ max);
    }
}
