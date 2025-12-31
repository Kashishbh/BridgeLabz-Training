class BankAccount {
    public String accountNumber;      
    protected String accountHolder;   
    private double balance;          
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {

    private double interestRate;
    public SavingsAccount(String accountNumber, String accountHolder,
                          double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber);   
        System.out.println("Account Holder: " + accountHolder);   
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Balance: " + getBalance());           
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC101", "Kashish", 10000.0);
        account.displayAccountDetails();

        System.out.println("------------------");

        account.deposit(2000.0);
        account.withdraw(1500.0);
        System.out.println("Updated Balance: " + account.getBalance());

        System.out.println("==================");
        SavingsAccount savings =
                new SavingsAccount("SAV201", "Rohan", 20000.0, 4.5);
        savings.displaySavingsAccountDetails();
    }
}
