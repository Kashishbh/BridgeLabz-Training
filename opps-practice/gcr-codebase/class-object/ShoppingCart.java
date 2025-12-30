class CartItem {
    private String itemName;
    private double price;
    private int quantity;
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }
    public void removeItem(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        } else {
            System.out.println("Cannot remove " + qty + ". Only " + quantity + " available.");
        }
    }
    public double getTotalCost() {
        return price * quantity;
    }
    public void displayItem() {
        System.out.printf("Item: %s, Price: $%.2f, Quantity: %d%n", itemName, price, quantity);
    }
}
public class ShoppingCart{
    public static void main(String[] args) {
        CartItem laptop = new CartItem("Laptop", 999.99, 1);
        laptop.displayItem();
        laptop.addItem(2);
        laptop.removeItem(1);
        System.out.printf("Total cost: $%.2f%n", laptop.getTotalCost());
    }
}
