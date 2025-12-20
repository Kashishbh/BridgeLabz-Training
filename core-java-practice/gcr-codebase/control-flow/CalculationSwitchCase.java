import java.util.Scanner;
class CalculationSwitchCase {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double num1= scan.nextDouble();
        double num2= scan.nextDouble();
        //give the sign of operator
        String op= scan.next();
        switch(op) {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
