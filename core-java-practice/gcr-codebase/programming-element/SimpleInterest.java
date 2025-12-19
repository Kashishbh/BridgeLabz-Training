import java.util.Scanner;

class SimpleInterest{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double pr = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double SI = (pr * rate * time) / 100;
        System.out.println(SI);
    }
}
