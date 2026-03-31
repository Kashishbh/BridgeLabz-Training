package HotelReservation;

public interface PricingStrategy {
    double calculatePrice(double basePrice, int days);
}
