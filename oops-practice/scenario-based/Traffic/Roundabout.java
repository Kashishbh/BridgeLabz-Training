package Traffic;

import java.util.ArrayList;
import java.util.List;

public class Roundabout {
    private List<Vehicle> activeVehicles;

    public Roundabout() {
        activeVehicles = new ArrayList<>();
    }

    public void enterRoundabout(Vehicle vehicle) {
        if (vehicle != null) {
            activeVehicles.add(vehicle);
            System.out.println(vehicle.getVehicleNumber() + " entered roundabout");
        }
    }

    public void exitRoundabout(String vehicleNumber) {
        for (Vehicle v : activeVehicles) {
            if (v.getVehicleNumber().equals(vehicleNumber)) {
                activeVehicles.remove(v);
                System.out.println(vehicleNumber + " exited roundabout");
                return;
            }
        }
        System.out.println("Vehicle not found in roundabout");
    }

    public void showStatus() {
        if (activeVehicles.isEmpty()) {
            System.out.println("Roundabout is empty");
            return;
        }

        System.out.print("Vehicles in Roundabout: ");
        for (Vehicle v : activeVehicles) {
            System.out.print(v.getVehicleNumber() + " -> ");
        }
        System.out.println("(continuous flow)");
    }
}
