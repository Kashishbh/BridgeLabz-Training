import java.util.Scanner;
class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int month = scan.nextInt(); 
        int day = scan.nextInt();
        int year = scan.nextInt(); 
        int year0 = year-(14-month) / 12;
        int x=year0 + year0/4 - year0 /100+year0/ 400;
        int month0= month+12*((14 - month)/12)- 2;
        int day0= (day + x +(31 * month0)/12)%7;
        System.out.println("Day of the week is: " + day0);
    }
}
