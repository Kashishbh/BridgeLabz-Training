package BankingAccountHierarchy;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("12345", 1000.0);
        System.out.printf("%.2f%n", savings.calculateFee());

        BankAccount savingsLow = new SavingsAccount("11111", 500.0);
        System.out.printf("%.2f%n", savingsLow.calculateFee());

        BankAccount checkingHigh = new CheckingAccount("22222", 1500.0);
        System.out.printf("%.2f%n", checkingHigh.calculateFee());

        BankAccount checkingLow = new CheckingAccount("33333", 500.0);
        System.out.printf("%.2f%n", checkingLow.calculateFee());
    }
}
