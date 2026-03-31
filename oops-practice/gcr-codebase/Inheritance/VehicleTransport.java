public class VehicleTransport{
    static class Vehicle {
        private int maxSpeed;
        private String fuelType;
        public Vehicle(int maxSpeed, String fuelType) {
            this.maxSpeed = maxSpeed;
            this.fuelType = fuelType;
        }
        public int getMaxSpeed() {
            return maxSpeed;
        }
        public String getFuelType() {
            return fuelType;
        }
        public void displayInfo() {
            System.out.println("Max Speed: " + maxSpeed + " km/h");
            System.out.println("Fuel Type: " + fuelType);
        }
    }
    static class Car extends Vehicle {
        private int seatCapacity;
        public Car(int maxSpeed, String fuelType, int seatCapacity) {
            super(maxSpeed, fuelType);
            this.seatCapacity = seatCapacity;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Seat Capacity: " + seatCapacity);
        }
    }
    static class Truck extends Vehicle {
        private double loadCapacity;

        public Truck(int maxSpeed, String fuelType, double loadCapacity) {
            super(maxSpeed, fuelType);
            this.loadCapacity = loadCapacity;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Load Capacity: " + loadCapacity + " tons");
        }
    }
    static class Motorcycle extends Vehicle {
        private boolean hasGear;
        public Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
            super(maxSpeed, fuelType);
            this.hasGear = hasGear;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Has Gear: " + hasGear);
        }
    }
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15.5);
        vehicles[2] = new Motorcycle(150, "Petrol", true);
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
