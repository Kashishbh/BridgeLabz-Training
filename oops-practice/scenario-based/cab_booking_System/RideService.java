package cab_booking_System;
import java.util.ArrayList;
import java.util.List;

public class RideService {

    private final List<Driver> drivers = new ArrayList<>();
    private final List<Ride> rideHistory = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void bookRide(User user, double distance, FareCalculator fareCalculator)
            throws NoDriverAvailableException {

        Driver assignedDriver = null;

        for (Driver driver : drivers) {
            if (driver.isAvailable()) {
                assignedDriver = driver;
                break;
            }
        }

        if (assignedDriver == null) {
            throw new NoDriverAvailableException("No drivers available at the moment!");
        }

        assignedDriver.assignDriver();
        double fare = fareCalculator.calculateFare(distance);

        Ride ride = new Ride(user, assignedDriver, fare);
        rideHistory.add(ride);

        System.out.println("Ride booked successfully!");
        ride.displayRide();
    }

    public void showRideHistory() {
        System.out.println("\n--- Ride History ---");
        for (Ride ride : rideHistory) {
            ride.displayRide();
        }
    }
}
