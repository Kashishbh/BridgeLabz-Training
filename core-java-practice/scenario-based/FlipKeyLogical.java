import java.util.*;
public class FlipKeyLogical {
	public static String CleanseAndInvert(String input) {
        if (input == null || input.length() < 6) {
            return "";
        }
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i))) {
                return "";
            }
        }
        input = input.toLowerCase();

        
        StringBuilder filtered = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int ascii = (int) input.charAt(i);
            if (ascii % 2 != 0) {
                filtered.append(input.charAt(i));
            }
        }

        
        filtered.reverse();

        
        for (int i = 0; i < filtered.length(); i++) {
            if (i % 2 == 0) {
                filtered.setCharAt(i, Character.toUpperCase(filtered.charAt(i)));
            }
        }

        return filtered.toString();
    }

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the word");
        String input = scan.nextLine();

        String result = CleanseAndInvert(input);

        if (result.isEmpty()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + result);
        }
    }
}
