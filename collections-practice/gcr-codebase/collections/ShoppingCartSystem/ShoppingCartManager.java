package ShoppingCartSystem;

import java.util.*;

public class ShoppingCartManager {

    private Map<String, Double> priceMap = new HashMap<>();
    private Map<String, Double> insertionOrderMap = new LinkedHashMap<>();

    //Add product
    public void addProduct(String name, double price) {
        priceMap.put(name, price);
        insertionOrderMap.put(name, price);
    }

    // Display items in insertion order 
    public void displayCartOrder() {
        System.out.println("\nCart items (Insertion Order):");
        for (Map.Entry<String, Double> entry : insertionOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " : ₹" + entry.getValue());
        }
    }

    //Display items sorted by price 
    public void displaySortedByPrice() {
        TreeMap<Double, String> sortedMap = new TreeMap<>();

        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nCart items (Sorted by Price):");
        for (Map.Entry<Double, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getValue() + " : ₹" + entry.getKey());
        }
    }
}
