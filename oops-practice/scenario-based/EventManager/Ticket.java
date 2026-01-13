package EventManager;
public class Ticket {
    private int ticketId;
    private double price;

    public Ticket(int ticketId, double price) {
        this.ticketId= ticketId;
        this.price= price;
    }

    public double getPrice() {
        return price;
    }

    public int getTicketId() {
        return ticketId;
    }
}
