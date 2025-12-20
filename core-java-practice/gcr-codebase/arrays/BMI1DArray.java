import java.util.Scanner;
public class BMI1DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = scan.nextInt();
        double[] weight= new double[n];
        double[] height= new double[n];
        double[] bmi= new double[n];
        String[] status= new String[n];
        for (int i= 0; i< n; i++) {
            System.out.print("Enter weight of person " + (i + 1) + ": ");
            weight[i] = scan.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + ": ");
            height[i] = scan.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i]< 18.5)
                status[i]= "Underweight";
            else if (bmi[i]< 25)
                status[i]= "Normal";
            else
                status[i]= "Overweight";
        }
        System.out.println("\nWeight Height BMI Status");
        for (int i= 0; i< n;i++) {
            System.out.println(weight[i] + " " + height[i] + " " + bmi[i] + " " + status[i]);
        }
    }
}
