package EventManager;
public class EventManagerApp {
    public static void main(String[] args) {

        TicketCatalog catalog = new TicketCatalog();

        catalog.addTicket(new Ticket(601, 8500));
        catalog.addTicket(new Ticket(602, 9200));
        catalog.addTicket(new Ticket(603, 4000));
        catalog.addTicket(new Ticket(604, 9800));
        catalog.addTicket(new Ticket(605, 5500));

        catalog.sortTicketsByPrice();   // Quick Sort 

        catalog.showTopTickets(3);     
    }
}
