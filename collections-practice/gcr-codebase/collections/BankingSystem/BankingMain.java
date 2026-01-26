package BankingSystem;

public class BankingMain{
    public static void main(String[] args) {

        BankManager bank = new BankManager();

        bank.addAccount(new Account(1, 5000));
        bank.addAccount(new Account(2, 12000));
        bank.addAccount(new Account(3, 8000));

        bank.requestWithdrawal(1, 2000);
        bank.requestWithdrawal(2, 1000);
        bank.requestWithdrawal(3, 15000);

        bank.processWithdrawals();
        bank.displaySortedByBalance();
    }
}
