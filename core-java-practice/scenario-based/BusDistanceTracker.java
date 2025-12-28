import java.util.Scanner;
class BusDistanceTracker {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int totalDist= 0;
        char choice= 'n';
        while (choice!= 'y') {
            System.out.print("Enter distance to next stop (in km): ");
            int distance= scan.nextInt();
            totalDist+= distance;
            System.out.println("Total distance so far: " + totalDist+ " km");
            System.out.print("Do you want to get off at this stop? (y/n): ");
            choice= scan.next().charAt(0);
        }
        System.out.println("\nPassenger got off.");
        System.out.println("Total distance travelled: " + totalDist+ " km");
    }
}
