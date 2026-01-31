import java.util.regex.*;
public class ValidateUsername {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);

        String[] usernames = {"user_123","123user","us","_user1","valid_User99"
        };
        for (String username : usernames) {
            Matcher matcher = pattern.matcher(username);
            System.out.println(username + " → " + matcher.matches());
        }
    }
}
