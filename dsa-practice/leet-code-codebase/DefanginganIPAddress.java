import java.util.Scanner;

public class DefanginganIPAddress {

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter IP Address: ");
        String ip = scan.nextLine();

        String result = defangIPaddr(ip);

        System.out.println("Defanged IP Address: " + result);

    }
}
