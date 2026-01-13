package ECommerce;

public class WalletPayment implements Payment {

    @Override
    public void makePayment(double amount) throws PaymentFailedException {
        System.out.println("Wallet payment of ₹" + amount + " successful.");
    }
}
