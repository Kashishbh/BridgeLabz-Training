import java.util.Scanner;
public class GradeArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n= scan.nextInt();
        double[] percentage= new double[n];
        char[] grade = new char[n];
        for (int i= 0; i< n; i++) {
            System.out.println("Enter marks for student "+(i + 1));
            System.out.print("Physics: ");
            double phy = scan.nextDouble();
            System.out.print("Chemistry: ");
            double chem = scan.nextDouble();
            System.out.print("Maths: ");
            double math = scan.nextDouble();
            if (phy < 0 || chem < 0 || math < 0) {
                System.out.println("Invalid marks. Enter again.");
                i--;
                continue;
            }
            percentage[i] = (phy + chem + math) / 3;
            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else grade[i] = 'D';
        }
        System.out.println("\nPercentage  Grade");
        for (int i = 0; i < n; i++)
            System.out.println(percentage[i] + "        " + grade[i]);
    }
}
