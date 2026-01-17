import java.util.*;
public class SortedMatrix {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("application start");
        int n=scan.nextInt();
        int m=scan.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		arr[i][j]=scan.nextInt();
        	}
        }
        int target=scan.nextInt();
        if(searchMatrix(arr,target)) {
        	System.out.println("target found in matrix");
        }
        else {
        	System.out.println("not found");
        }
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / cols;
            int col = mid % cols;
            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
