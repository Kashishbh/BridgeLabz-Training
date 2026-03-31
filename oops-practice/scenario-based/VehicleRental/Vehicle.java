package VehicleRental;

public abstract class Vehicle implements IRentable {

    protected int vehicleId;
    protected String brand;
    protected double ratePerDay;

    protected Vehicle(int vehicleId, String brand, double ratePerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.ratePerDay = ratePerDay;
    }

    public abstract void displayDetail();
}
