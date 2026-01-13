package HotelReservation;

public class PeakSeasonPricing implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice, int days) {
        return basePrice * days * 1.3;
    }
}
