package DigitalWallet;

public class WalletTransfer implements TransferService {
    @Override
    public void transfer(
            Wallet sender,
            Wallet receiver,
            double amount
    ) throws InsufficientBalanceException {

        sender.deductMoney(amount);
        receiver.addMoney(amount);
    }
}
