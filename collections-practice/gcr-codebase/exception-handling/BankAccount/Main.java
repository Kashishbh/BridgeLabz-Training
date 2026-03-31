package BankAccount;

public class Main {
	public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(1200); 
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        
        try {
            account.withdraw(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        try {
            account.withdraw(-200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
