package cab_booking_System;
public class CabBookingSystem {

    public static void main(String[] args) {

        RideService rideService = new RideService();

        rideService.addDriver(new Driver(1, "Saurav"));
        rideService.addDriver(new Driver(2, "priyansh"));

        User user = new User(101, "Kashish");

        FareCalculator normalFare = new NormalFare();
        FareCalculator peakFare = new PeakFare();

        try {
            rideService.bookRide(user, 8, normalFare);
            rideService.bookRide(user, 5, peakFare);
        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }

        rideService.showRideHistory();
    }
}
