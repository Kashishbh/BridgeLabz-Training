package HotelReservation;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Reservation bookRoom(
            Guest guest,
            int days,
            PricingStrategy pricing
    ) throws RoomNotAvailableException {

        for (Room room : rooms) {
            if (room.isAvailable()) {
                room.checkIn();
                Reservation reservation = new Reservation(room, guest, days);
                reservations.add(reservation);

                double bill = pricing.calculatePrice(room.getBasePrice(), days);
                System.out.println("Invoice Amount: ₹" + bill);
                return reservation;
            }
        }
        throw new RoomNotAvailableException("No rooms available!");
    }

    public void checkOut(Reservation reservation) {
        reservation.getRoom().checkOut();
        System.out.println("Checked out successfully");
    }
}
