import java.util.*;
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        setPrice(price);
        setQuantity(quantity);
    }
    public abstract double calculateTotalPrice();
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
        System.out.println("-------------------------");
    }
    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }
    private void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }
    private void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be at least 1");
        }
        this.quantity = quantity;
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }
    @Override
    public String getDiscountDetails() {
        return "10% discount on Veg items";
    }
}
class NonVegItem extends FoodItem {
    private static final double EXTRA_CHARGE = 50.0;
    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + EXTRA_CHARGE;
    }
}
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        FoodItem veg = new VegItem("Hakka Noodles", 200, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 250, 1);
        order.add(veg);
        order.add(nonVeg);
        processOrder(order);
    }
    public static void processOrder(List<FoodItem> items) {
        double grandTotal = 0;
        for (FoodItem item : items) {
            item.getItemDetails();
            grandTotal += item.calculateTotalPrice();
            if (item instanceof Discountable) {
                Discountable discountItem = (Discountable) item;
                double discount = discountItem.applyDiscount();
                System.out.println(discountItem.getDiscountDetails());
                System.out.println("Discount Applied: " + discount);
                grandTotal -= discount;
                System.out.println("-------------------------");
            }
        }
        System.out.println("Final Amount Payable: " + grandTotal);
    }
}
