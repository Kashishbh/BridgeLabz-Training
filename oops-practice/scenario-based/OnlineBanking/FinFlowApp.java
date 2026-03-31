package OnlineBanking;

public class FinFlowApp {

    public static void main(String[] args) {

        FinFlowBankService bank = new FinFlowBankService();

        Account acc1 = new SavingsAccount(101, 5000);
        Account acc2 = new CurrentAccount(102, 3000);

        bank.createAccount(acc1);
        bank.createAccount(acc2);

        Runnable task1 = () -> {
            try {
                bank.transferFunds(101, 102, 1000);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        };

        Runnable task2 = () -> {
            try {
                bank.transferFunds(101, 102, 2000);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ignored) {}

        System.out.println("\nFinal Balance:");
        System.out.println("Account 101: ₹" + bank.checkBalance(101));
        System.out.println("Account 102: ₹" + bank.checkBalance(102));

        bank.showTransactionHistory(101);
        bank.showTransactionHistory(102);
    }
}
