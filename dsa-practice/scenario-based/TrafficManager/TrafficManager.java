package TrafficManager;
import java.util.Scanner;
public class TrafficManager {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        Roundabout roundabout = new Roundabout();
        VehicleQueue queue = new VehicleQueue(5);

        while (true) {
            System.out.println("\nTraffic Manager Menu --");
            System.out.println("1. Add vehicle to waiting queue");
            System.out.println("2. Move vehicle to roundabout");
            System.out.println("3. Remove vehicle from roundabout");
            System.out.println("4. Display roundabout");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle number: ");
                    queue.enqueue(scan.nextLine());
                    break;

                case 2:
                    String vehicle = queue.dequeue();
                    if (vehicle != null) {
                        roundabout.addVehicle(vehicle);
                    }
                    break;

                case 3:
                    System.out.print("Enter vehicle number to remove: ");
                    roundabout.removeVehicle(scan.nextLine());
                    break;

                case 4:
                    roundabout.display();
                    break;

                case 5:
                    System.out.println("Traffic system closed.");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
