package ECommerce;

public class UPIPayment implements Payment {

    @Override
    public void makePayment(double amount) throws PaymentFailedException {
        if (amount < 100) {
            throw new PaymentFailedException("UPI payment failed!");
        }
        System.out.println("UPI payment of ₹" + amount + " successful.");
    }
}
  