import java.util.Scanner;
class MetroSmartCard{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double balance=100;
        int choice;
        System.out.println("Initial Smart Card Balance: ₹"+balance);
        do {
            System.out.print("\nEnter distance travelled (in km): ");
            int dist= scan.nextInt();
            int fare= (dist<= 5)?10:(dist<= 15)?20:30;
            if (balance>=fare) {
                balance-=fare;
                System.out.println("Fare: ₹"+fare);
                System.out.println("Remaining Balance: ₹"+balance);
            } else {
                System.out.println("Insufficient balance. Please recharge!");
                break;
            }
            System.out.print("Do you want to continue? (1 = Yes, 0 = No): ");
            choice = scan.nextInt();
        } while (choice==1&&balance>0);
        System.out.println("\nThank you for using Delhi Metro");
    }
}
