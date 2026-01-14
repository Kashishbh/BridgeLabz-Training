import java.util.*;
public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(twoSum(nums, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (mp.containsKey(num)) {
                result[0] = mp.get(num);
                result[1] = i;
            }
            mp.put(nums[i], i);
        }
        return result;
    }
}
