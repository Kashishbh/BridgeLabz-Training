import java.util.Scanner;
class BMI{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double weight= scan.nextDouble(); 
        double heightCm= scan.nextDouble();
        double heightM= heightCm / 100;
        double bmi= weight/(heightM*heightM);
        System.out.println("BMI: "+bmi);
        if(bmi<18.5)
            System.out.println("Underweight");
        else if(bmi<25)
            System.out.println("Normal weight");
        else if(bmi<30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
