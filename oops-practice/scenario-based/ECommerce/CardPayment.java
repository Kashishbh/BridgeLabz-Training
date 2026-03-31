package ECommerce;

public class CardPayment implements Payment {

    @Override
    public void makePayment(double amount) throws PaymentFailedException {
        if (amount <= 0) {
            throw new PaymentFailedException("Card payment failed!");
        }
        System.out.println("Card payment of ₹" + amount + " successful.");
    }
}

