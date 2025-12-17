import java.util.Scanner;

class Area_of_circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println(area);
    }
}
