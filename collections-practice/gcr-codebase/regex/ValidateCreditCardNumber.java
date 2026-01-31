import java.util.regex.*;

public class ValidateCreditCardNumber{
    public static void main(String[] args) {
        // Visa: starts with 4, 16 digits
        // MasterCard: starts with 5, 16 digits
        String regex = "^(4\\d{15}|5\\d{15})$";
        Pattern pattern = Pattern.compile(regex);

        String[] cards = {
            "4123456789012345",
            "7123456789012345",
            "6123456789012345",
            "41234"
        };

        for (String card : cards) {
            System.out.println(card + " → " + pattern.matcher(card).matches());
        }
    }
}
