import java.util.Scanner;
class CountWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        while (count>= 1) {
            System.out.println(count);
            count--;
        }
    }
}
