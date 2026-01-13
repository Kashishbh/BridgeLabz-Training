package InventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements AlertService {

    private List<Product> products = new ArrayList<>();
    private static final int LOW_STOCK_LIMIT = 5;

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public void updateStock(int productId, int amount)
            throws OutOfStockException {

        for (Product p : products) {
            if (p.getProductId() == productId) {
                if (amount < 0) {
                    p.reduceStock(Math.abs(amount));
                } else {
                    p.addStock(amount);
                }

                if (p.getQuantity() <= LOW_STOCK_LIMIT) {
                    sendLowStockAlert(p);
                }
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void viewStock() {
        System.out.println("\n--- Inventory Stock ---");
        for (Product p : products) {
            System.out.println(p.getProductId() + " | " +
                    p.getName() + " | Qty: " + p.getQuantity());
        }
    }

    @Override
    public void sendLowStockAlert(Product product) {
        System.out.println("⚠ Low Stock Alert: " +
                product.getName() +
                " (Qty: " + product.getQuantity() + ")");
    }
}
