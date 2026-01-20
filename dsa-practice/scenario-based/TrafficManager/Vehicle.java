package TrafficManager;

class Vehicle {
    private String vehicleNumber;
    Vehicle next;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.next = null;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
