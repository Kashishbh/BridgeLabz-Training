import java.util.*;  
interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        setBalance(balance);
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    public abstract double calculateInterest();
    protected double getBalance() {
        return balance;
    }
    protected void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
        System.out.println("---------------------------");
    }
}
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: " + amount);
    }
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}
class CurrentAccount extends BankAccount {
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        BankAccount acc1 = new SavingsAccount("SB111", "Kashish", 50000);
        BankAccount acc2 = new CurrentAccount("CA222", "Rishab", 80000);
        accounts.add(acc1);
        accounts.add(acc2);
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
        }
        if (acc1 instanceof Loanable) {
            Loanable loanAccount = (Loanable) acc1;
            loanAccount.applyForLoan(200000);
            System.out.println("Loan Eligibility: " + loanAccount.calculateLoanEligibility());
        }
    }
}
