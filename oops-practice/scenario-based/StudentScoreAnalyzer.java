import java.util.Scanner;
class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}
public class StudentScoreAnalyzer {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        try {
            System.out.print("Enter number of students: ");
            int n = scan.nextInt();
            int[] scores = new int[n];
            System.out.println("Enter student scores:");
            for (int i = 0; i < n; i++) {
                int score = scan.nextInt();
                validateScore(score);
                scores[i] = score;
            }
            double average = calculateAverage(scores);
            int highest = findMax(scores);
            int lowest = findMin(scores);
            System.out.println("\nScore Analysis:");
            System.out.println("Average Score: " + average);
            System.out.println("Highest Score: " + highest);
            System.out.println("Lowest Score: " + lowest);
        } catch (InvalidScoreException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only.");
        } finally {
        }
    }
    public static void validateScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Score must be between 0 and 100.");
        }
    }
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
    public static int findMax(int[] scores) {
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }
    public static int findMin(int[] scores) {
        int min = scores[0];
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }
}
