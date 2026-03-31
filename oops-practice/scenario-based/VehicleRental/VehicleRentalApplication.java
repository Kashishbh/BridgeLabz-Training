package VehicleRental;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalApplication {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Bike(612, "Royal Enfield", 900));
        vehicles.add(new Car(126, "Maruti Swift", 4000));
        vehicles.add(new Truck(203, "Mahindra Blazo", 3500));

        System.out.println("Available Vehicles");
        for (Vehicle v : vehicles) {
            v.displayDetail(); 
        }

        Customer customer = new Customer(1, "Kashish");

        customer.rentVehicle(vehicles.get(0), 3);
        customer.rentVehicle(vehicles.get(1), 2);
    }
}
