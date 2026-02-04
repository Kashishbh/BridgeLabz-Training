package SortingECommerce;

import java.util.ArrayList;
import java.util.List;

public class SortingECommerceMain {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 70000, 4.5, 10));
        products.add(new Product("Laptop Charger", 5000, 4., 15));
        products.add(new Product("Headphones", 1750, 4.2, 5));
        products.add(new Product("Smartwatch", 2000, 4.6, 20));

        // Sort by Price (ascending)
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        // Sort by Rating (descending)
        products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        // Sort by Discount (descending)
        products.sort((p1, p2) -> Double.compare(p2.getDiscount(), p1.getDiscount()));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}
