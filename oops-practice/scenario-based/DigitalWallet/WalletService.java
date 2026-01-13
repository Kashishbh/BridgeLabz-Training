package DigitalWallet;

import java.util.ArrayList;
import java.util.List;

public class WalletService {
    private List<Transaction> transactions = new ArrayList<>();

    public void addMoney(Wallet wallet, double amount) {
        wallet.addMoney(amount);
        transactions.add(new Transaction("ADD", amount));
    }

    public void withdrawMoney(Wallet wallet, double amount)
            throws InsufficientBalanceException {

        wallet.deductMoney(amount);
        transactions.add(new Transaction("WITHDRAW", amount));
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t.getDetails());
        }
    }
}
