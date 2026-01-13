package DigitalWallet;

public class BankTransfer implements TransferService {
    @Override
    public void transfer(
            Wallet sender,
            Wallet receiver,
            double amount
    ) throws InsufficientBalanceException {

        double bankFee = 10;
        sender.deductMoney(amount + bankFee);
        receiver.addMoney(amount);
    }
}
