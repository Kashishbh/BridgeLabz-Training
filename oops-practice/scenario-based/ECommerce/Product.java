package ECommerce;

public class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println(productId + "   " + name + "   ₹" + price);
    }
}
