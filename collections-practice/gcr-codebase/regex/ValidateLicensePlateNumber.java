import java.util.regex.*;

public class ValidateLicensePlateNumber{
    public static void main(String[] args) {

        String regex = "^[A-Z]{2}\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        String[] plates = {"AB1234","A12345","KA1206"
        };
        for (String plate : plates) {
            System.out.println(plate + " → " + pattern.matcher(plate).matches());
        }
    }
}
