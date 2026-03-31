package Traffic;

import java.util.ArrayList;
import java.util.List;

public class EntryLane {
    private int capacity;
    private List<Vehicle> waitingVehicles;

    public EntryLane(int capacity) {
        this.capacity = capacity;
        waitingVehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (waitingVehicles.size() == capacity) {
            System.out.println("Entry Lane Full! Vehicle cannot enter.");
            return;
        }
        waitingVehicles.add(vehicle);
        System.out.println(vehicle.getVehicleNumber() + " added to entry lane");
    }

    public Vehicle allowEntry() {
        if (waitingVehicles.isEmpty()) {
            System.out.println("No vehicles waiting to enter.");
            return null;
        }
        return waitingVehicles.remove(0);
    }
}
