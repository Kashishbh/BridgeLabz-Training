import java.util.Scanner;
class SimpleInterest {
    public static double  FindSI(double p, double r, double  t){
        double simpleIntrest=(p*r*t)/100;
        return simpleIntrest;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter principal amount");
        double p=scan.nextDouble();
        System.out.println("Enter rate of Interest");
        double r=scan.nextDouble();
        System.out.println("Enter Time");
        double t=scan.nextDouble();
        double SI= FindSI(p, r, t);
        System.out.println("The Simple Interest is " + SI+" for Principal " +p+", Rate of Interest " +r+" and Time " +t);
    }
}
