class HotelBooking{
    private String guestName;
    private String roomType;
    private int nights;
    public HotelBooking() {
        this("Guest", "Standard", 1);
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;  
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking otherBooking) {
        this(otherBooking.guestName, otherBooking.roomType, otherBooking.nights);
    }
    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }


    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        booking1.displayDetails(); 
        System.out.println("------------------");
        HotelBooking booking2 = new HotelBooking("Kashish", "Deluxe", 3);
        booking2.displayDetails();
        System.out.println("------------------");
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayDetails();
    }
}
