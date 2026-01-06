import java.util.Scanner;
public class StudentScore{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Enter number of students: ");
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Number of students must be positive.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scan.next(); // clear invalid input
            }
        }

        int[] scores= new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter score for student " + (i + 1) + ": ");
                if (scan.hasNextInt()) {
                    int score = scan.nextInt();
                    if (score >= 0) {
                        scores[i] = score;
                        sum += score;
                        break;
                    } else {
                        System.out.println("Score cannot be negative.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a numeric score.");
                    scan.next();
                }
            }
        }
        double avg= (double) sum/ n;
        int highest= scores[0];
        int lowest= scores[0];
        for (int score : scores) {
            if (score>highest) {
                highest=score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("\n--- Results ---");
        System.out.println("Average Score: " + avg);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Scores above average:");
        boolean found = false;
        for (int score : scores) {
            if (score>avg) {
                System.out.println(score);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No scores above average.");
        }
    }
}
