package DigitalWallet;

public class DigitalWalletSystem {
    public static void main(String[] args) {

        User u1 = new User(1, "Kashish");
        User u2 = new User(2, "Khushi");

        Wallet w1 = new Wallet(u1);
        Wallet w2 = new Wallet(u2);

        WalletService service = new WalletService();
        TransferService transfer = new WalletTransfer();

        service.addMoney(w1, 5000);

        try {
            transfer.transfer(w1, w2, 2000);
            service.withdrawMoney(w1, 500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Wallet 1 Balance: ₹" + w1.getBalance());
        System.out.println("Wallet 2 Balance: ₹" + w2.getBalance());

        service.showTransactions();
    }
}
