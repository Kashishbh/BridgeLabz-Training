public class VehicleManagement{
    static class Vehicle {
        private String model;
        private int maxSpeed;
        public Vehicle(String model, int maxSpeed) {
            this.model = model;
            this.maxSpeed = maxSpeed;
        }
        public String getModel() {
            return model;
        }
        public int getMaxSpeed() {
            return maxSpeed;
        }
        public void displayInfo() {
            System.out.println("Model: " + model);
            System.out.println("Max Speed: " + maxSpeed + " km/h");
        }
    }
    interface Refuelable {
        void refuel();
    }
    static class ElectricVehicle extends Vehicle {

        public ElectricVehicle(String model, int maxSpeed) {
            super(model, maxSpeed);
        }
        public void charge() {
            System.out.println("Electric vehicle is charging");
        }
    }
    static class PetrolVehicle extends Vehicle implements Refuelable {
        public PetrolVehicle(String model, int maxSpeed) {
            super(model, maxSpeed);
        }
        @Override
        public void refuel() {
            System.out.println("Petrol vehicle is being refueled");
        }
    }
    public static void main(String[] args) {
        Vehicle ev = new ElectricVehicle("MG ZS EV", 140);
        Vehicle pv = new PetrolVehicle("Honda City", 180);
        ev.displayInfo();
        ((ElectricVehicle) ev).charge();
        System.out.println();
        pv.displayInfo();
        ((Refuelable) pv).refuel();
    }
}

