import java.util.Scanner;
class InvalidInvoiceFormatException extends Exception {
    public InvalidInvoiceFormatException(String message) {
        super(message);
    }
}
public class InvoiceGeneratorFreelancer{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        try {
            System.out.println("Enter invoice details:");
            System.out.println("Example: Logo Design - 3000 INR, Web Page - 4500 INR");
            String input = scan.nextLine();
            String[] tasks = parseInvoice(input);
            int totalAmount = getTotalAmount(tasks);
            System.out.println("\nInvoice Details:");
            for (String task : tasks) {
                System.out.println(task.trim());
            }
            System.out.println("Total Invoice Amount: " + totalAmount + " INR");
        } catch (InvalidInvoiceFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
        }
    }
    public static String[] parseInvoice(String input) throws InvalidInvoiceFormatException {
        if (!input.contains("-")) {
            throw new InvalidInvoiceFormatException("Invalid format: Missing '-' separator.");
        }
        String[] tasks = input.split(",");
        if (tasks.length == 0) {
            throw new InvalidInvoiceFormatException("Invalid format: No tasks found.");
        }
        return tasks;
    }
    public static int getTotalAmount(String[] tasks) throws InvalidInvoiceFormatException {
        int total = 0;
        for (String task : tasks) {
            String[] parts = task.split("-");
            if (parts.length != 2) {
                throw new InvalidInvoiceFormatException("Invalid format in task: " + task.trim());
            }
            String amountPart = parts[1].trim();
            String[] amountTokens = amountPart.split(" ");
            if (amountTokens.length < 1) {
                throw new InvalidInvoiceFormatException(
                        "Amount missing in task: " + task.trim());
            }
            try {
                int amount = Integer.parseInt(amountTokens[0]);
                total += amount;
            } catch (NumberFormatException e) {
                throw new InvalidInvoiceFormatException("Invalid amount in task: " + task.trim());
            }
        }
        return total;
    }
}
