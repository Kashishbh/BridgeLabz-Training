import java.util.Scanner;
public class StudentScore{
    static int[][] generateScores(int students) {
        int[][] score= new int[students][3];
        for (int i= 0; i< students;i++) {
            score[i][0]= 10+(int)(Math.random() * 90); // Physics
            score[i][1]= 10+(int)(Math.random() * 90); // Chemistry
            score[i][2]= 10+(int)(Math.random() * 90); // Maths
        }
        return score;
    }
    static double[][] calculateResult(int[][] scores) {
        int students = scores.length;
        double[][] result = new double[students][3];
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }
    static String[] calculateGrades(double[][] result) {
        int students = result.length;
        String[] grade= new String[students];
        for (int i = 0; i < students; i++) {
            double percent = result[i][2];
            if (percent >= 80)
                grade[i] = "A";
            else if (percent >= 70)
                grade[i] = "B";
            else if (percent >= 60)
                grade[i] = "C";
            else if (percent >= 50)
                grade[i] = "D";
            else if (percent >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }
        return grade;
    }
    static void displayScoreCard(int[][] scores, double[][] result, String[] grades) {
        System.out.println("\nStudent\tPhysics\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i= 0; i<scores.length;i++) {
            System.out.println(
                (i + 1)+"\t" +
                scores[i][0]+"\t" +
                scores[i][1]+"\t" +
                scores[i][2]+"\t" +
                (int)result[i][0]+"\t" +
                result[i][1]+ "\t" +
                result[i][2]+ "\t" +
                grades[i]
            );
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int student= scan.nextInt();
        int[][] scores= generateScores(student);
        double[][] result= calculateResult(scores);
        String[] grade= calculateGrades(result);
        displayScoreCard(scores,result,grade);
    }
}
