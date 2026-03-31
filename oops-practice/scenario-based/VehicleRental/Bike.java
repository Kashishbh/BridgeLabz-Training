package VehicleRental;

public class Bike extends Vehicle {

    public Bike(int vehicleId, String brand, double ratePerDay) {
        super(vehicleId, brand, ratePerDay);
    }

    @Override
    public double calRent(int days) {
        return ratePerDay * days;
    }

    @Override
    public void displayDetail() {
        System.out.println("Bike | ID: " + vehicleId +
                ", Brand: " + brand +
                ", Rate/Day: ₹" + ratePerDay);
    }
}
