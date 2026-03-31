package FlightBooking;
public class FlightBookingSystem {

    public static void main(String[] args) {

        BookingService service= new BookingService();

        System.out.println("Searching Flights");
        service.searchFlight("Agra", "Bangalore");
        service.searchFlight("Delhi", "Mumbai");

        System.out.println("\nBooking Flight");
        service.bookFlight(103);
        service.bookFlight(101);

        System.out.println("\nView Bookings");
        service.displayBookings();
    }
}
