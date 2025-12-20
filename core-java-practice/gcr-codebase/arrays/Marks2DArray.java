import java.util.Scanner;
public class Marks2DArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        double[][] marks= new double[n][3];
        double[] percentage= new double[n];
        char[] grade= new char[n];
        for (int i= 0; i< n; i++) {
            marks[i][0]= scan.nextDouble();
            marks[i][1]= scan.nextDouble();
            marks[i][2]= scan.nextDouble();
            percentage[i]= (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            if (percentage[i]>= 90) grade[i] = 'A';
            else if (percentage[i]>= 75) grade[i] = 'B';
            else if (percentage[i]>= 60) grade[i] = 'C';
            else grade[i] = 'D';
        }
        for (int i = 0; i < n; i++)
            System.out.println(percentage[i] + " " + grade[i]);
    }
}
