import java.util.Scanner;
class MultipleFor {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        if (num>0 && num<100) {
            for (int i=100; i>=1;i--) {
                if (i%num==0)
                    System.out.println(i);
            }
        }
    }
}
