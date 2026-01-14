
import java.util.*;
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++) {
        	nums[i]=scan.nextInt();
        }
        System.out.println(longestConsecutive(nums));
	}
	public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        
        
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

       
        for (int num : nums) {
            
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
