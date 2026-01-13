package Traffic;

public class TrafficManager {
    public static void main(String[] args) {

        EntryLane entryLane = new EntryLane(3);
        Roundabout roundabout = new Roundabout();

        entryLane.addVehicle(new Vehicle("CAR-1"));
        entryLane.addVehicle(new Vehicle("CAR-2"));
        entryLane.addVehicle(new Vehicle("CAR-3"));
        entryLane.addVehicle(new Vehicle("CAR-4")); 

        roundabout.enterRoundabout(entryLane.allowEntry());
        roundabout.enterRoundabout(entryLane.allowEntry());

        roundabout.showStatus();

        roundabout.exitRoundabout("CAR-1");
        roundabout.showStatus();

        roundabout.enterRoundabout(entryLane.allowEntry());
        roundabout.showStatus();

        entryLane.allowEntry();
    }
}
