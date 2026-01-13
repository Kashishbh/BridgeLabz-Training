package HotelReservation;

public class HotelReservationSystem {
    public static void main(String[] args) {

        HotelService service = new HotelService();

        service.addRoom(new StandardRoom(101));
        service.addRoom(new DeluxeRoom(201));

        Guest guest = new Guest(1, "Kashish");

        PricingStrategy pricing = new PeakSeasonPricing();

        try {
            Reservation reservation =
                    service.bookRoom(guest, 3, pricing);

            service.checkOut(reservation);

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
