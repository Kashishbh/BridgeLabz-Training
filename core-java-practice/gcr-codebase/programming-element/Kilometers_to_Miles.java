import java.util.Scanner;

class Kilometers_to_Miles{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();

        double miles = km * 0.621371;
        System.out.println(miles);
    }
}
