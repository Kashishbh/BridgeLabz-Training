package OnlineBanking;

import java.util.HashMap;
import java.util.Map;

public class FinFlowBankService implements BankService {

    private final Map<Integer, Account> accounts = new HashMap<>();

    @Override
    public void createAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account created: " + account.getAccountNumber());
    }

    @Override
    public double checkBalance(int accountNumber) {
        return accounts.get(accountNumber).getBalance();
    }

    @Override
    public synchronized void transferFunds(
            int fromAcc, int toAcc, double amount)
            throws InsufficientBalanceException {

        Account sender = accounts.get(fromAcc);
        Account receiver = accounts.get(toAcc);

        sender.withdraw(amount);
        receiver.deposit(amount);

        System.out.println("Transferred ₹" + amount +
                " from " + fromAcc + " to " + toAcc);
    }

    @Override
    public void showTransactionHistory(int accountNumber) {
        System.out.println("\nTransaction History for Account: " + accountNumber);
        for (Transaction t : accounts.get(accountNumber).getTransactions()) {
            System.out.println(t);
        }
    }
}
