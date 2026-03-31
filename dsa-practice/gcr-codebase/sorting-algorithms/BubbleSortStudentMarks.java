
import java.util.Scanner;
public class BubbleSortStudentMarks {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swap;
        for(int i=0;i<n-1;i++) {
        	swap=false;
        	//swapping
        	for(int j=0;j<n-1;j++) {
        		if (marks[j]>marks[j+1]) {
        			int temp=marks[j];
        			marks[j]=marks[j+1];
        			marks[j+1]=temp;
        			swap=true;
        		}
        	}
        	if(!swap) break;
        }
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scan.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter student marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = scan.nextInt();
        }
        // Sort marks
        bubbleSort(marks);
        System.out.println("Student marks in ascending order:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}

