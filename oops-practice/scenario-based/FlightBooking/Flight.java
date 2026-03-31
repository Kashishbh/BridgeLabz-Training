package FlightBooking;

public class Flight {

    int flightId;
    String flightName;
    String source;
    String destination;

    public Flight(int flightId, String flightName,
                  String source, String destination) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
    }

    public void displayFlight() {
        System.out.println(flightId + " | " + flightName +
                " | " + source + " -> " + destination);
    }
}
