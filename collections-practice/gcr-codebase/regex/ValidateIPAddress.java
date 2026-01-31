import java.util.regex.*;
public class ValidateIPAddress{
    public static void main(String[] args) {
        String regex =
                "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}" + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";
        Pattern pattern = Pattern.compile(regex);
        String[] ipAddresses = { "192.168.1.1","255.255.255.255","256.100.10.1","192.168.1","01.02.03.04"};
        for (String ip : ipAddresses) {
            System.out.println(ip + " ->  " + pattern.matcher(ip).matches());
        }
    }
}
