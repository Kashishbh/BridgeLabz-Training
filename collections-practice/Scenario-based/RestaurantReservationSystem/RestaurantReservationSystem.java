package RestaurantReservationSystem;

import java.util.*;

public class RestaurantReservationSystem {

    private Map<Integer, Table> tables;
    private List<Reservation> reservations;

    public RestaurantReservationSystem() {
        tables = new HashMap<>();
        reservations = new ArrayList<>();
    }

    // Add tables to restaurant
    public void addTable(Table table) {
        tables.put(table.getTableNumber(), table);
    }

    // Reserve a table
    public void reserveTable(int tableNumber, String timeSlot, String customerName)
            throws TableAlreadyReservedException {

        for (Reservation r : reservations) {
            if (r.getTableNumber() == tableNumber &&
                r.getTimeSlot().equalsIgnoreCase(timeSlot)) {

                throw new TableAlreadyReservedException(
                        "Table " + tableNumber + " is already reserved for " + timeSlot
                );
            }
        }

        reservations.add(new Reservation(tableNumber, timeSlot, customerName));
        System.out.println("Reservation successful for " + customerName);
    }

    // Cancel reservation
    public void cancelReservation(int tableNumber, String timeSlot) {
        Iterator<Reservation> iterator = reservations.iterator();

        while (iterator.hasNext()) {
            Reservation r = iterator.next();
            if (r.getTableNumber() == tableNumber &&
                r.getTimeSlot().equalsIgnoreCase(timeSlot)) {

                iterator.remove();
                System.out.println("Reservation cancelled for Table " + tableNumber);
                return;
            }
        }

        System.out.println("No reservation found to cancel.");
    }

    // Show available tables for a time slot
    public void showAvailableTables(String timeSlot) {
        System.out.println("Available tables for " + timeSlot + ":");

        for (Table table : tables.values()) {
            boolean reserved = false;

            for (Reservation r : reservations) {
                if (r.getTableNumber() == table.getTableNumber() &&
                    r.getTimeSlot().equalsIgnoreCase(timeSlot)) {
                    reserved = true;
                    break;
                }
            }

            if (!reserved) {
                System.out.println("Table " + table.getTableNumber()
                        + " (Capacity: " + table.getCapacity() + ")");
            }
        }
    }
}
