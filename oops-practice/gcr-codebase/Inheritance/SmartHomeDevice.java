public class SmartHomeDevice{
    static class Device {
        private String deviceId;
        private boolean status; 
        public Device(String deviceId, boolean status) {
            this.deviceId = deviceId;
            this.status = status;
        }
        public String getDeviceId() {
            return deviceId;
        }
        public boolean isStatus() {
            return status;
        }
        public void displayStatus() {
            System.out.println("Device ID: " + deviceId);
            System.out.println("Status: " + (status ? "ON" : "OFF"));
        }
    }
    static class Thermostat extends Device {
        private double temperatureSetting;
        public Thermostat(String deviceId, boolean status, double temperatureSetting) {
            super(deviceId, status);
            this.temperatureSetting = temperatureSetting;
        }
        @Override
        public void displayStatus() {
            super.displayStatus();
            System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        }
    }
    public static void main(String[] args) {
        Device device = new Thermostat("KB-612", true, 35.5);
        device.displayStatus();
    }
}
