package InventoryManagement;

public class Product {

    private int productId;
    private String name;
    private int quantity;

    public Product(int productId, String name, int quantity) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addStock(int amount) {
        quantity += amount;
    }

    public void reduceStock(int amount) throws OutOfStockException {
        if (amount > quantity) {
            throw new OutOfStockException("Not enough stock for product: " + name);
        }
        quantity -= amount;
    }
}
