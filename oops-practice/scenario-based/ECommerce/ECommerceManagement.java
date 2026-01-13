package ECommerce;
import java.util.*;

public class ECommerceManagement {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(600, "Phone", 75000));
        products.add(new Product(400, "Mic", 1060));

        System.out.println("Product Catalog");
        for (Product p : products) {
            p.displayProduct();
        }
        Customer customer = new Customer(1, "Kashish");
        Order order = new Order(1206, products.get(0), customer);
        Payment payment = new CardPayment();
        try {
            payment.makePayment(order.getOrderAmount());
            System.out.println("Order placed successfully!");
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nOrder Details");
        order.displayOrder();

        System.out.println("\nCancelling Order");
        order.cancelOrder();
        order.displayOrder();
    }
}
