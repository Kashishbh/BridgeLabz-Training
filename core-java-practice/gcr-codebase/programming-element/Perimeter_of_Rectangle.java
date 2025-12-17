import java.util.Scanner;

class Perimeter_of_Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double len = sc.nextDouble();
        double w = sc.nextDouble();

        double perimeter = 2 * (len + w);
        System.out.println(perimeter);
    }
}
