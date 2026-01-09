package VehicleRental;
public class Car extends Vehicle {

    public Car(int vehicleId, String brand, double ratePerDay) {
        super(vehicleId, brand, ratePerDay);
    }

    @Override
    public double calRent(int days) {
        return (ratePerDay * days) + 500;
    }

    @Override
    public void displayDetail() {
        System.out.println("Car | ID: " + vehicleId +
                ", Brand: " + brand +
                ", Rate/Day: ₹" + ratePerDay);
    }
}
