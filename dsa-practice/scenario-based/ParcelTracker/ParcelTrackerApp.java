package ParcelTracker;

import java.util.Scanner;

public class ParcelTrackerApp {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();
        while (true) {
            System.out.println("\nParcel Tracker Menu --");
            System.out.println("1. Track Parcel");
            System.out.println("2. Add Intermediate Checkpoint");
            System.out.println("3. Mark Parcel as Lost");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    tracker.trackParcel();
                    break;

                case 2:
                    System.out.print("Enter existing stage: ");
                    String after = scan.nextLine();
                    System.out.print("Enter new checkpoint stage: ");
                    String stage = scan.nextLine();
                    tracker.addCheckpoint(after, stage);
                    break;

                case 3:
                    tracker.markParcelLost();
                    break;

                case 4:
                    System.out.println("Parcel tracking system closed.");
                  
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
