import java.util.Scanner;
class PowerOfNum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        int power= scan.nextInt();
        int result= 1;
        for (int i= 1;i<= power;i++) {
            result*= num;
        }
        System.out.println(result);
    }
}
