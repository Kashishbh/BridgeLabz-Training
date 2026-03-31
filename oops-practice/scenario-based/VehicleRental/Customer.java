package VehicleRental;
public class Customer {

    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        System.out.println("\nCustomer: " + name);
        vehicle.displayDetail();
        System.out.println("Rental Days: " + days);
        System.out.println("Total Rent: ₹" + vehicle.calRent(days));
    }
}
