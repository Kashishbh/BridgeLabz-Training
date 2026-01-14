import java.util.*;
public class CheckPairGivenSum {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=scan.nextInt();
        }
        int target=scan.nextInt();
        System.out.println(pairWithSum(arr,target));
	}
	public static boolean pairWithSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            int required = target - num;
            
            if (set.contains(required)) {
                return true;
            }
            
            set.add(num);
        }
        
        return false;
    }
}
