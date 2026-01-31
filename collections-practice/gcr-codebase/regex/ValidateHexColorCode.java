import java.util.regex.*;

public class ValidateHexColorCode {
    public static void main(String[] args) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        Pattern pattern = Pattern.compile(regex);

        String[] colors = {"#FFA500", "#ff4500","#123"
        };
        for (String color : colors) {
            System.out.println(color + " → " + pattern.matcher(color).matches());
        }
    }
}
