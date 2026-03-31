package cab_booking_System;
public class Driver {

    private final int driverId;
    private final String name;
    private boolean available;

    public Driver(int driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void assignDriver() {
        this.available = false;
    }

    public void releaseDriver() {
        this.available = true;
    }

    public String getName() {
        return name;
    }
}
