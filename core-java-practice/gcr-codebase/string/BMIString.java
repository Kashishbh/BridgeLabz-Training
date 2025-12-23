import java.util.Scanner;
public class BMIString{
    static String[][] calculateBMI(double[][] data) {
        String[][] result= new String[10][4];
        for (int i= 0; i< 10; i++) {
            double weight= data[i][0];
            double heightCm= data[i][1];
            double heightM= heightCm / 100;  
            double bmi= weight/(heightM*heightM);
            bmi= Math.round(bmi * 100.0) / 100.0;
            String status;
            if (bmi<= 18.4)
                status= "Underweight";
            else if (bmi<= 24.9)
                status= "Normal";
            else if (bmi<= 39.9)
                status= "Overweight";
            else
                status= "Obese";
            result[i][0]= String.valueOf(heightCm);
            result[i][1]= String.valueOf(weight);
            result[i][2]= String.valueOf(bmi);
            result[i][3]= status;
        }
        return result;
    }
    static void displayResult(String[][] result) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i= 0; i< 10; i++) {
            System.out.println(
                    result[i][0]+"\t\t" +
                    result[i][1]+"\t\t" +
                    result[i][2]+"\t" +
                    result[i][3]
            );
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double[][] data= new double[10][2];
        for (int i= 0; i< 10;i++) {
            System.out.print("Enter weight (kg) for person " + (i+1)+": ");
            data[i][0] = scan.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1)+": ");
            data[i][1]= scan.nextDouble();
        }
        String[][] result = calculateBMI(data);
        displayResult(result);
    }
}
