import java.util.Scanner;
public class InsertionSortEmployeesID {
	public static void insertionSort(int[] id){
		int n= id.length;
		for(int i=1;i<n;i++) {
			int key=id[i];
			int j=i-1;
			while(j>=0 && id[j]>key) {
				id[j+1]=id[j];
				j--;
			}
			id[j+1]=key;
		}
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter number of Employee: ");
		int n = scan.nextInt();
		int[] id = new int[n];
		System.out.println("Enter Employee IDs:");
		for (int i = 0; i < n; i++) {
			id[i] = scan.nextInt();
		}
		insertionSort(id);
		System.out.println("Employee IDs in ascending order:");
		for (int mark : id) {
			System.out.print(mark + " ");
		}
		
	}

}
