import java.util.Scanner;

class PerimeterRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double len = sc.nextDouble();
        double width = sc.nextDouble();

        double perimeter = 2 * (len + width);
        System.out.println(perimeter);
    }
}
