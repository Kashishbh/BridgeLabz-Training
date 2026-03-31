package ECommerce;

public interface Payment {
    void makePayment(double amount) throws PaymentFailedException;
}

