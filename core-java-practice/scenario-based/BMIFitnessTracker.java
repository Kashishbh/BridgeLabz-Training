import java.util.Scanner;
public class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight= scan.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = scan.nextDouble();
        // BMI calculation
        double bmi= weight / (height * height);
        String category;
        // BMI category check
        if (bmi < 18.5) {
            category= "Underweight";
        } else if (bmi < 25) {
            category= "Normal";
        } else {
            category= "Overweight";
        }
        // Output
        System.out.println("BMI Value: " + bmi);
        System.out.println("Health Status: " + category);
    }
}
