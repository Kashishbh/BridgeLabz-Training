import java.util.*;
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation = "Unknown";
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        setRatePerKm(ratePerKm);
    }
    public abstract double calculateFare(double distance);
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
        System.out.println("---------------------------");
    }
    protected double getRatePerKm() {
        return ratePerKm;
    }
    protected void setLocation(String location) {
        this.currentLocation = location;
    }
    private void setRatePerKm(double rate) {
        if (rate <= 0) {
            throw new IllegalArgumentException("Rate per km must be positive");
        }
        this.ratePerKm = rate;
    }
}
class Car extends Vehicle implements GPS {

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50; 
    }
    @Override
    public String getCurrentLocation() {
        return "Car Location Active";
    }
    @Override
    public void updateLocation(String location) {
        setLocation(location);
    }
}
class Bike extends Vehicle implements GPS {

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return "Bike Location Active";
    }

    @Override
    public void updateLocation(String location) {
        setLocation(location);
    }
}
class Auto extends Vehicle implements GPS {

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // service charge
    }
    @Override
    public String getCurrentLocation() {
        return "Auto Location Active";
    }
    @Override
    public void updateLocation(String location) {
        setLocation(location);
    }
}
public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle car = new Car("C101", "Rohit", 15);
        Vehicle bike = new Bike("B202", "Aman", 8);
        Vehicle auto = new Auto("A303", "Suresh", 10);
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);
        calculateFares(vehicles, 12.5);
    }
    public static void calculateFares(List<Vehicle> vehicles, double distance) {
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare: ₹" + vehicle.calculateFare(distance));q
        }
    }
}
