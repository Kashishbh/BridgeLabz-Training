package ShoppingCartSystem;

public class ShoppingCartMain{
    public static void main(String[] args) {

        ShoppingCartManager cart = new ShoppingCartManager();

        cart.addProduct("Laptop", 60000);
        cart.addProduct("Mouse", 800);
        cart.addProduct("Tablet", 25000);
        cart.addProduct("Mobile Phone", 66000);

        cart.displayCartOrder();
        cart.displaySortedByPrice();
    }
}
