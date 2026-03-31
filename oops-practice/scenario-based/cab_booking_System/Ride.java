package cab_booking_System;
public class Ride {

    private final User user;
    private final Driver driver;
    private final double fare;

    public Ride(User user, Driver driver, double fare) {
        this.user = user;
        this.driver = driver;
        this.fare = fare;
    }

    public void displayRide() {
        System.out.println(
            "User: " + user.getName() +
            ", Driver: " + driver.getName() +
            ", Fare: ₹" + fare
        );
    }
}
