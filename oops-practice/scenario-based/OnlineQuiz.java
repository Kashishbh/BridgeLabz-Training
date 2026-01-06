import java.util.*;
import java.util.Scanner;
class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}
class QuizProcessor {
    public int calculateScore(String[] correctAnswers, String[] userAnswers)
            throws InvalidQuizSubmissionException {

        if (correctAnswers.length != userAnswers.length) {
            throw new InvalidQuizSubmissionException("Number of answers does not match the quiz questions.");
        }

        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
        return score;
    }
    public String getGrade(int score, int total) {
        double percentage = (score * 100.0) / total;

        if (percentage >= 80) return "A";
        else if (percentage >= 60) return "B";
        else if (percentage >= 40) return "C";
        else return "Fail";
    }
}
public class OnlineQuiz{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        QuizProcessor processor = new QuizProcessor();
        List<Integer> allScores = new ArrayList<>();

        String[] correctAnswers = {"A", "B", "C", "D", "A"};

        System.out.print("Enter number of users: ");
        int users = scan.nextInt();
        scan.nextLine(); 

        for (int u = 1; u <= users; u++) {
            System.out.println("\nUser " + u + ": Enter your answers");

            String[] userAnswers = new String[correctAnswers.length];
            for (int i = 0; i < userAnswers.length; i++) {
                System.out.print("Q" + (i + 1) + ": ");
                userAnswers[i] = scan.nextLine();
            }

            try {
                int score = processor.calculateScore(correctAnswers, userAnswers);
                allScores.add(score);
                String grade = processor.getGrade(score, correctAnswers.length);

                System.out.println("Score: " + score + "/" + correctAnswers.length);
                System.out.println("Grade: " + grade);

            } catch (InvalidQuizSubmissionException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nAll Users Scores: " + allScores);
    }
}
