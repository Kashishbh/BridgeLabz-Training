class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    TicketNode(int ticketId, String customerName, String movieName,
               String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = this;  
    }
}
class TicketList{
    TicketNode head = null;
    void addTicket(int id, String customer, String movie,
                   String seat, String time) {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newNode;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }
    void removeTicket(int id) {
        if (head == null) return;

        TicketNode curr = head;
        TicketNode prev = null;

        do {
            if (curr.ticketId == id) {
                if (curr == head) {
                    TicketNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }
    void displayTicket() {
        if (head == null) return;

        TicketNode temp = head;
        do {
            System.out.println(
                temp.ticketId + " " +
                temp.customerName + " " +
                temp.movieName + " " +
                temp.seatNumber + " " +
                temp.bookingTime
            );
            temp = temp.next;
        } while (temp != head);
    }
    void searchTicket(String value) {
        if (head == null) return;

        TicketNode temp = head;
        do {
            if (temp.customerName.equals(value) ||
                temp.movieName.equals(value)) {
                System.out.println("Found Ticket ID: " + temp.ticketId);
            }
            temp = temp.next;
        } while (temp != head);
    }
    void countTicket() {
        if (head == null) {
            System.out.println("Total Tickets: 0");
            return;
        }

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Total Tickets: " + count);
    }
}
public class TicketReservationSystem {
    public static void main(String[] args) {
        TicketList list= new TicketList();
        list.addTicket(1, "Pratham", "Avatar", "A1", "01:30 PM");
        list.addTicket(2, "Muakan", "Dhurandar", "B2", "04:30 PM");
        list.addTicket(3, "Arush", "Dhurandar", "C3", "11:30 AM");
        list.displayTicket();
        list.searchTicket("Avatar");
        list.countTicket();
        list.removeTicket(2);
        list.displayTicket();
    }
}
