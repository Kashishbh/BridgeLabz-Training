package SmartDeviceControlInterface;

public class Main {
	public static void main(String[] args) {
        AC ac=new AC();
        Light light=new Light();
        ac.turnOn();
        ac.turnOff();
        light.turnOn();
        light.turnOff();
	}

}
