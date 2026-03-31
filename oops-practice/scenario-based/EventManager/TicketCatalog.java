package EventManager;

import java.util.List;
import java.util.ArrayList;

public class TicketCatalog {
    private List<Ticket> tickets;

    public TicketCatalog() {
        tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void sortTicketsByPrice() {
        quickSort(0, tickets.size() - 1);
    }

    // Quick Sort logic (business hidden)
    private void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        double pivotPrice = tickets.get(high).getPrice();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets.get(j).getPrice() <= pivotPrice) {
                i++;
                Ticket temp = tickets.get(i);
                tickets.set(i, tickets.get(j));
                tickets.set(j, temp);
            }
        }

        Ticket temp = tickets.get(i + 1);
        tickets.set(i + 1, tickets.get(high));
        tickets.set(high, temp);

        return i + 1;
    }

    public void showTopTickets(int count) {
        System.out.println("Top " + count + " Tickets by Price:");
        for (int i = 0; i < Math.min(count, tickets.size()); i++) {
            System.out.println("Ticket ID: " +
                    tickets.get(i).getTicketId() +
                    ", Price: ₹" + tickets.get(i).getPrice());
        }
    }
}
