package HotelReservation;

public class NormalSeasonPricing implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice, int days) {
        return basePrice * days;
    }
}
