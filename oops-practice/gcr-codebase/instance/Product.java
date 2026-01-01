class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        incrementProductCount();
    }
    private static void incrementProductCount() {
        totalProducts++;
    }
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 75000.0);
        Product p2 = new Product("Mobile", 30000.0);
        Product p3 = new Product("Tablet", 25000.0);
        p1.displayProductDetails();
        System.out.println("------------------");
        p2.displayProductDetails();
        System.out.println("------------------");
        p3.displayProductDetails();
        System.out.println("------------------");
        Product.displayTotalProducts();
    }
}
