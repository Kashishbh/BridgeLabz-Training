import java.util.regex.*;
public class ExtractCurrencyValues {
    public static void main(String[] args) {
        String text= "The price is $45.99, and the discount is 10.50.";
        String regex= "\\$?\\b\\d+(\\.\\d{2})\\b";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
        StringBuilder result= new StringBuilder();
        while (matcher.find()) {
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append(matcher.group());
        }
        System.out.println(result.toString());
    }
}
