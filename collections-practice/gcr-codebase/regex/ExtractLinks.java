import java.util.regex.*;
public class ExtractLinks {
    public static void main(String[] args) {
        String text= "Visit https://www.google.com and http://example.org for more info.";
        String regex= "https?://[a-zA-Z0-9.-]+";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append(matcher.group());
        }
        System.out.println(result.toString());
    }
}
