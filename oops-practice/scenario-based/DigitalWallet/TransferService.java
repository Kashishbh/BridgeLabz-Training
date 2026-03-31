package DigitalWallet;

public interface TransferService {
    void transfer(
            Wallet sender,
            Wallet receiver,
            double amount
    ) throws InsufficientBalanceException;
}

