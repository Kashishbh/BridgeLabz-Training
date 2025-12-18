import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double unit_Price;
        int quantity;
        unit_Price = sc.nextDouble();
        quantity = sc.nextInt();

        double total = unit_Price * quantity;

        System.out.println("The total purchase price is INR " + total +
                " if the quantity " + quantity +
                " and unit price is INR " + unit_Price);
    }
}
