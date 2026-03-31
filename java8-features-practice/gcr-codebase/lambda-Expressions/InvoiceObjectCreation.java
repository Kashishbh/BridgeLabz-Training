import java.util.Arrays;
import java.util.List;
class Invoice {
    private int transactionId;
    public Invoice(int transactionId) {
        this.transactionId = transactionId;
    }
    public void showInvoice() {
        System.out.println("Invoice created for Transaction ID: " + transactionId);
    }
}
public class InvoiceObjectCreation {
    public static void main(String[] args) {
        List<Integer> transactionIds =
                Arrays.asList(973,371,133);
        transactionIds.stream()
                      .map(Invoice::new)   // constructor reference
                      .forEach(Invoice::showInvoice);
    }
}
