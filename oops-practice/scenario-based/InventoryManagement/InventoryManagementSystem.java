package InventoryManagement;

public class InventoryManagementSystem {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Monitor", 10);
        Product p2 = new Product(102, "Mouse", 4);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.viewStock();

        try {
            inventory.updateStock(101, -6);
            inventory.updateStock(102, -2);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }

        inventory.viewStock();
    }
}
