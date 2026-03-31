package ECommerce;

public class Order {

    private int orderId;
    private Product product;
    private Customer customer;
    private String status;

    public Order(int orderId, Product product, Customer customer) {
        this.orderId = orderId;
        this.product = product;
        this.customer = customer;
        this.status = "PLACED";
    }

    public void cancelOrder() {
        status = "CANCELLED";
        System.out.println("Order " + orderId + " cancelled.");
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId +
                ", Customer: " + customer.getName() +
                ", Product Price: ₹" + product.getPrice() +
                ", Status: " + status);
    }

    public double getOrderAmount() {
        return product.getPrice();
    }
}

