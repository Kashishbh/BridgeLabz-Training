package cab_booking_System;

public class PeakFare implements FareCalculator {

    @Override
    public double calculateFare(double distance) {
        return distance * 15;
    }
}
