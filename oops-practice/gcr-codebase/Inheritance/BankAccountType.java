public class BankAccountType {
    static class BankAccount {
        private String accountNumber;
        private double balance;
        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public String getAccountNumber() {
            return accountNumber;
        }
        public double getBalance() {
            return balance;
        }
        public void displayDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
        }
        public void displayAccountType() {
            System.out.println("Generic Bank Account");
        }
    }
    static class SavingsAccount extends BankAccount {
        private double interestRate;
        public SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }
        @Override
        public void displayAccountType() {
            System.out.println("Account Type: Savings Account");
            System.out.println("Interest Rate: " + interestRate + "%");
        }
    }
    static class CheckingAccount extends BankAccount {
        private double withdrawalLimit;
        public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
            super(accountNumber, balance);
            this.withdrawalLimit = withdrawalLimit;
        }
        @Override
        public void displayAccountType() {
            System.out.println("Account Type: Checking Account");
            System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
        }
    }
    static class FixedDepositAccount extends BankAccount {
        private int tenureYears;

        public FixedDepositAccount(String accountNumber, double balance, int tenureYears) {
            super(accountNumber,balance);
            this.tenureYears=tenureYears;
        }

        @Override
        public void displayAccountType() {
            System.out.println("Account Type: Fixed Deposit Account");
            System.out.println("Tenure: "+tenureYears+" years");
        }
    }
    public static void main(String[] args) {
        BankAccount ac1 = new SavingsAccount("SA1012", 35000, 4);
        BankAccount ac2 = new CheckingAccount("CA0612", 390000, 14000);
        BankAccount ac3 = new FixedDepositAccount("FD2003", 200000, 4);
        ac1.displayDetails();
        ac1.displayAccountType();
        System.out.println();
        ac2.displayDetails();
        ac2.displayAccountType();
        System.out.println();
        ac3.displayDetails();
        ac3.displayAccountType();
    }
}
