package RestaurantReservationSystem;

public class Main {

    public static void main(String[] args) {

        RestaurantReservationSystem system = new RestaurantReservationSystem();

        system.addTable(new Table(1, 4));
        system.addTable(new Table(2, 2));
        system.addTable(new Table(3, 6));

        try {
            system.reserveTable(1, "7PM-8PM", "Kashish");
            system.reserveTable(2, "7PM-8PM", "Priya");
            system.reserveTable(1, "7PM-8PM", "Kanchan"); // Exception
        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        system.showAvailableTables("7PM-8PM");

        system.cancelReservation(1, "7PM-8PM");

        system.showAvailableTables("7PM-8PM");
    }
}
