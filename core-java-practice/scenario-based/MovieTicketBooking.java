import java.util.*;
public class MovieTicketBooking {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        char customers = 'y';
        while (customers == 'y' || customers == 'Y') {
            int totalBill = 0;
            System.out.println("Select Seat Type (gold/silver):");
            String seatType = scan.next();
            if (seatType.equalsIgnoreCase("gold")) {
                totalBill += 100;
            } else if (seatType.equalsIgnoreCase("silver")) {
                totalBill += 50;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }
            System.out.println("Do you want snacks? (yes/no):");
            String snacksChoice = scan.next();

            if (snacksChoice.equalsIgnoreCase("yes")) {
                totalBill += 80;
            }
            System.out.println("Total Ticket Price: ₹" + totalBill);
            customers = scan.next().charAt(0);
        }

       
	}

}
