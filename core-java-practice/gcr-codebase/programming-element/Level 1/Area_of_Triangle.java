import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, height;
        base = sc.nextDouble();
        height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;

        System.out.println("The area of triangle in square centimeters is "
                + areaCm + " and square inches is " + areaInches);
    }
}
