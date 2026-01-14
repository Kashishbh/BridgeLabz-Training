import java.util.*;
public class SlidingWindowMaximum {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++) {
        	nums[i]=scan.nextInt();
        }
        int k=scan.nextInt();
        System.out.println(maxSlidingWindow(nums,k));
	}
	public static int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        int idx=0;
        for(int i=0;i<nums.length;i++){
            
            if(!dq.isEmpty() && dq.peek()==i-k){
                dq.poll();
            }
          
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offer(i);
            if(i>=k-1){
                res[idx++]=nums[dq.peek()];
            }
        }
        return res;
    }
}
