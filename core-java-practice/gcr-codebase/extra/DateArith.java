import java.time.LocalDate;
import java.util.Scanner;
class DateArith {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String inputDate = scan.nextLine();
        LocalDate date = LocalDate.parse(inputDate);
        // Date calculation
        date= date.plusDays(7);
        date= date.plusMonths(1);
        date= date.plusYears(2);
        date= date.minusWeeks(3);
        System.out.println("Final Date after calculations: "+date);
    }
}
