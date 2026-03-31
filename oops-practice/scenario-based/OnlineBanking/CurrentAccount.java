package OnlineBanking;

public class CurrentAccount extends Account {

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.01;
    }
}
