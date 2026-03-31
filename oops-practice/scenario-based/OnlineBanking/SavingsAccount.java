package OnlineBanking;
public class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }
}

