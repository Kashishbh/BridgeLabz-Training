import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int v3 = sc.nextInt();
        int r1 = v1 + v2 * v3;
        int r2 = v1 * v2 + v3;
        int r3 = v3 + v1 / v2;
        int r4 = v1 % v2 + v3;

        System.out.println("The results of Int Operations are "
                + r1 + ", " + r2 + ", " + r3 + ", and " + r4);
    }
}
