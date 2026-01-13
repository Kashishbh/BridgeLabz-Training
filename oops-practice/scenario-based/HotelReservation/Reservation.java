package HotelReservation;

public class Reservation {
    private Room room;
    private Guest guest;
    private int days;

    public Reservation(Room room, Guest guest, int days) {
        this.room = room;
        this.guest = guest;
        this.days = days;
    }

    public Room getRoom() {
        return room;
    }

    public int getDays() {
        return days;
    }
}

