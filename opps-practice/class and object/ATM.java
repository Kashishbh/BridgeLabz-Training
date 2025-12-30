class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw amount is : " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
        displayBalance();
    }
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}
public class ATM{
    public static void main(String[] args) {
        BankAccount account = new BankAccount("State of Chennai", "CHN001", 700.0);
        account.displayBalance();
        account.deposit(200.0);
        account.withdraw(100.0);
        account.withdraw(1000.0);
    }
}
