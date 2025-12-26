import java.util.Scanner;
public class HandShake{
    public static int findHandshake(int num) {
        return (num* (num- 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scan.nextInt();
        int handshakes=findHandshake(numberOfStudents);
        System.out.println("The maximum number of possible handshakes is: "
        +handshakes);
    }
}
