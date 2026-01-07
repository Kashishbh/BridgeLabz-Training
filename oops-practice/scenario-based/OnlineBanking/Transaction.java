package OnlineBanking;
import java.time.LocalDateTime;

public class Transaction {

    private final String type;
    private final double amount;
    private final LocalDateTime time;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.time = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return type + " | Amount: ₹" + amount + " | Time: " + time;
    }
}
