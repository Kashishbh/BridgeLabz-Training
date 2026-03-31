package VehicleRental;
public class Truck extends Vehicle {

    public Truck(int vehicleId, String brand, double ratePerDay) {
        super(vehicleId, brand, ratePerDay);
    }

    @Override
    public double calRent(int days) {
        return (ratePerDay * days) + 1000;
    }

    @Override
    public void displayDetail() {
        System.out.println("Truck | ID: " + vehicleId +
                ", Brand: " + brand +
                ", Rate/Day: ₹" + ratePerDay);
    }
}
