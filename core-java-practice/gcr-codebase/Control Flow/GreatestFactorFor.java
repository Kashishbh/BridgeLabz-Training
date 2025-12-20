import java.util.Scanner;
class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int gFactor = 1;
        for (int i=num- 1; i>=1;i--) {
            if (num%i==0) {
                gFactor = i;
                break;
            }
        }
        System.out.println(gFactor);
    }
}
