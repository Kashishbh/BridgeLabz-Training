import java.util.Scanner;
class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        int gFactor = 1;
        int count= num- 1;
        while (count>= 1) {
            if (num% count== 0) {
                gFactor = count;
                break;
            }
            count--;
        }
        System.out.println(gFactor);
    }
}
