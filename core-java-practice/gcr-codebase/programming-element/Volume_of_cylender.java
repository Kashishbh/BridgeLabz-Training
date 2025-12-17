import java.util.Scanner;

class Volume_of_Cylender {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();

        double vol = Math.PI * r * r * h;
        System.out.println(vol);
    }
}
