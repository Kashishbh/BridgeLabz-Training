import java.util.regex.*;
public class FindRepeatingWords {
    public static void main(String[] args) {
        String text="This is is a repeated repeated word test.";
        String regex="\\b(\\w+)\\s+\\1\\b";

        Pattern pattern= Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher(text);
        StringBuilder result =new StringBuilder();
        while (matcher.find()) {
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append(matcher.group(1));
        }
        System.out.println(result.toString());
    }
}
