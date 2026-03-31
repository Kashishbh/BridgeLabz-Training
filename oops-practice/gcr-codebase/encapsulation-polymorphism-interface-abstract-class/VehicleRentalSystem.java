import java.util.*;
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        setRentalRate(rentalRate);
    }
    public abstract double calculateRentalCost(int days);
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate >= 0) {
            this.rentalRate = rentalRate;
        }
    }
    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Cost (" + days + " days): " + calculateRentalCost(days));

        if (this instanceof Insurable) {
            Insurable insurable = (Insurable) this;
            System.out.println(insurable.getInsuranceDetails());
            System.out.println("Insurance Cost: " + insurable.calculateInsurance());
        }

        System.out.println("---------------------------");
    }
}
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Applied (Policy No: ****" +
                insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4) + ")";
    }
}
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10; // 10% insurance
    }
    public String getInsuranceDetails() {
        return "Bike Insurance Applied (Policy No: ****" +
                insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4) + ")";
    }
}
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }
    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 1000;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.25; 
    }
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Applied (Policy No: ****" +
                insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4) + ")";
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR-300", 2070, "CARINS0612"));
        vehicles.add(new Bike("BIKE-802", 590, "BIKEINS2002"));
        vehicles.add(new Truck("TRUCK-903", 9000, "TRUCKINS2003"));
        int rentalDays = 5;
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails(rentalDays);
        }
    }
}
