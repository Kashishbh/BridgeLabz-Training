import java.time.LocalDate;
import java.util.Scanner;
class DateComparison{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate d1= LocalDate.parse(scan.nextLine());
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate d2= LocalDate.parse(scan.nextLine());
        if (d1.isBefore(d2)) {
            System.out.println("First date is BEFORE the second date");
        } 
        else if (d1.isAfter(d2)) {
            System.out.println("First date is AFTER the second date");
        } 
        else if (d1.isEqual(d2)) {
            System.out.println("Both dates are the SAME");
        }
    }
}
