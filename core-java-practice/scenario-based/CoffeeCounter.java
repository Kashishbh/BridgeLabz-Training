import java.util.Scanner;
public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double GST_RATE= 0.05; 
        while (true) {
            System.out.print("Enter coffee type (Espresso / Latte / Cappuccino) or 'exit': ");
            String coffeeType = scan.next();
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting Ravi's Café ");
                break;
            }
            System.out.print("Enter quantity: ");
            int quantity= scan.nextInt();
            double price= 0;
            // Switch for types of coffee 
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price= 100;
                    break;
                case "latte":
                    price= 120;
                    break;
                case "cappuccino":
                    price= 150;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue; 
            }
            // calculation of bill
            double total = price* quantity;
            double gst = total * GST_RATE;
            double totalAmount = total + gst;
            // Output
            System.out.println("Total Amount: " + total);
            System.out.println("GST (5%): " +gst);
            System.out.println("Final Bill: " +totalAmount);
        }
    }
}
