import java.util.*;
public class LibraryReminder{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        int finePerDay = 5;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Due Date: ");
            int dueDate = scan.nextInt();
            System.out.print("Enter Return Date: ");
            int returnDate=scan.nextInt();
            if (returnDate > dueDate) {
                int late= returnDate-dueDate;
                int fine= late*finePerDay;
                System.out.println("Late by "+late+" days");
                System.out.println("Fine: "+fine);
            } else {
                System.out.println("Returned on time");
            }
        }
	}

}
