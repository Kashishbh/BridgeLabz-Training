package HotelReservation;

public class Room {
    protected int roomNumber;
    protected boolean available;
    protected double basePrice;

    public Room(int roomNumber, double basePrice) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void checkIn() {
        available = false;
    }

    public void checkOut() {
        available = true;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
