package cab_booking_System;

public class NormalFare implements FareCalculator {

    @Override
    public double calculateFare(double distance) {
        return distance * 10;
    }
}

