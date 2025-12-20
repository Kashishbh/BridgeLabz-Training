import java.util.Scanner;
class Table6To9{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i=6;i<=9;i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
