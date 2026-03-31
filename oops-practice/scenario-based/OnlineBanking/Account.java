package OnlineBanking;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    private final int accountNumber;
    private double balance;
    private final List<Transaction> transactions = new ArrayList<>();

    protected Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
    }

    public synchronized void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        transactions.add(new Transaction("Withdraw", amount));
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    // Polymorphism
    public abstract double calculateInterest();
}
