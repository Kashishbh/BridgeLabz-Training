import java.util.Scanner;
public class CheckIpAdress{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter IP Address: ");
        String ip = scan.nextLine();

        if (isValidIP(ip)) {
            System.out.println("Valid IP Address");
        } else {
            System.out.println("Invalid IP Address");
        }
    }
    static boolean isValidIP(String ip) {
        String[] parts = ip.split(" \\.");
        if (parts.length != 4)
            return false;
        for (int i = 0; i< 4; i++) {
            int num = Integer.parseInt(parts[i]);
            if (num < 0 || num > 255)
                return false;
        }
        return true;

    }
}

