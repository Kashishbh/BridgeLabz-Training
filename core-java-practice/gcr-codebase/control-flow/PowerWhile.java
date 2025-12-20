import java.util.Scanner;
class PowerWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int power=scan.nextInt();
        int result=1;
        int count=0;
        while (count< power) {
            result*=num;
            count++;
        }
        System.out.println(result);
    }
}
