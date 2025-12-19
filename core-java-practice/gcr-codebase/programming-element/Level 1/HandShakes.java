import java.util.Scanner;

public class HandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents;
        numberOfStudents = sc.nextInt();

        int handShakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is " + handShakes);
    }
}
