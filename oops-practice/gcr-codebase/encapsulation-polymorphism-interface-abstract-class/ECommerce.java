import java.util.*;
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
abstract class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
    }
    public abstract double calculateDiscount();
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
    public double calculateFinalPrice() {
        double tax = (this instanceof Taxable)
                ? ((Taxable) this).calculateTax()
                : 0;

        return price + tax - calculateDiscount();
    }

    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Base Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
        if (this instanceof Taxable) {
            System.out.println(((Taxable) this).getTaxDetails());
        }
        System.out.println("Final Price: " + calculateFinalPrice());
        System.out.println("---------------------------");
    }
}
class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Applied: 18% GST";
    }
}
class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; 
    }

    @Override
    public String getTaxDetails() {
        return "Tax Applied: 12% GST";
    }
}
class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; 
    }
}
public class ECommerce {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 3000));
        products.add(new Groceries(103, "Rice Bag", 1200));

        for (Product product : products) {
            product.displayDetails();
        }
    }
}
