import java.util.Scanner;
public class StudentVote{
    static int[] Age(int n) {
        Scanner scan= new Scanner(System.in);
        int[] age= new int[n];
        for (int i= 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = scan.nextInt();
        }
        return age;
    }
    static String[][] checkVoting(int[] ages) {
        String[][] result= new String[ages.length][2];
        for (int i= 0; i< ages.length;i++) {
            result[i][0]= String.valueOf(ages[i]);
            if (ages[i]< 0) {
                result[i][1]="false";
            } else if (ages[i]>= 18) {
                result[i][1]="true";
            } else {
                result[i][1]="false";
            }
        }
        return result;
    }
    static void display(String[][] data) {
        System.out.println("\nAge\tCan Vote");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
    // Main method
    public static void main(String[] args) {
        int numOfStudent = 10; // fixed as per question
        int[] ages= Age(numOfStudent);     // ✅ USER INPUT HERE
        String[][] result= checkVoting(ages);
        display(result);
    }
}
