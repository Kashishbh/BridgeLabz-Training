import java.util.Scanner;
class Bonus {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double salary= scan.nextDouble();
        int year= scan.nextInt();
        if (year>5) {
            double bonus=salary*0.05;
            System.out.println("Bonus Amount= "+bonus);
        } else {
            System.out.println("No Bonus");
        }
    }
}
