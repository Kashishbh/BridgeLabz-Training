import java.util.Scanner;
public class BMI2DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[][] data = new double[n][3];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            data[i][0]= scan.nextDouble(); // weight
            data[i][1]= scan.nextDouble(); // height

            data[i][2]= data[i][0] /
                    (data[i][1] * data[i][1]);

            if (data[i][2]< 18.5) status[i] = "Underweight";
            else if (data[i][2]< 25) status[i] = "Normal";
            else status[i] = "Overweight";
        }
        for (int i= 0; i<n; i++)
            System.out.println(data[i][0]+" "+data[i][1]+" "+data[i][2]+ " " +status[i]);
    }
}
