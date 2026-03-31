package FlightBooking;

import java.util.ArrayList;
import java.util.List;

public class BookingService {

    // Array to store available flights
    private Flight[] availableFlights = {
            new Flight(101, "Air India", "Delhi", "Mumbai"),
            new Flight(102, "IndiGo", "Bangalore", "Chennai"),
            new Flight(103, "Vistara", "Agra", "Bangalore"),
            new Flight(104, "SpiceJet", "Mumbai", "Agra")
    };

    // List to store booked flights
    private List<Flight> bookedFlights = new ArrayList<>();

    // Search flights (case-insensitive)
    public void searchFlight(String source, String destination) {
        boolean found = false;

        for (Flight flight : availableFlights) {
            if (flight.source.equalsIgnoreCase(source)
                    && flight.destination.equalsIgnoreCase(destination)) {
                flight.displayFlight();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No flights found!");
        }
    }

    // Book flight by ID
    public void bookFlight(int flightId) {
        for (Flight flight : availableFlights) {
            if (flight.flightId == flightId) {
                bookedFlights.add(flight);
                System.out.println("Flight booked successfully!");
                return;
            }
        }
        System.out.println("Invalid Flight ID!");
    }

    // Display booked flights
    public void displayBookings() {
        if (bookedFlights.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }

        System.out.println("\n--- Booking Details ---");
        for (Flight flight : bookedFlights) {
            flight.displayFlight();
        }
    }
}
