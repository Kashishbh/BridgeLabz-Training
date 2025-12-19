import java.util.Scanner;

class VolumeCylender {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double ht = sc.nextDouble();

        double vol = Math.PI * radius * radius * ht;
        System.out.println(vol);
    }
}
