import java.util.*;
public class RotationPoint {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the index: ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=scan.nextInt();
        }
        System.out.print(findRotationIndex(arr));
	}
	public static int findRotationIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;   
            } else {
                right = mid;      
            }
        }
        return left;  
    }
}
