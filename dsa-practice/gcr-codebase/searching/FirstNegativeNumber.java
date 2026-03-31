import java.util.*;
public class FirstNegativeNumber {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a length of the array: ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=scan.nextInt();
        }
        System.out.println(firstNegative(arr));
	}
    public static int firstNegative(int[] arr) {
    	
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]<0) {
    			return i;
    		}
    	}
    	return -1;
    }
}
