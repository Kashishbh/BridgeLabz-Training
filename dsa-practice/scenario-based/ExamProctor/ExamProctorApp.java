package ExamProctor;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ExamProctorApp {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        QuestionNavigator navigator = new QuestionNavigator();
        AnswerStore answerStore = new AnswerStore();
        // Correct answers (normally from DB)
        Map<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");

        while (true) {
            System.out.println("\nExam Proctor Menu ---");
            System.out.println("1. Visit Question");
            System.out.println("2. Go Back");
            System.out.println("3. Submit Answer");
            System.out.println("4. Submit Exam");
            System.out.print("Enter choice: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Question ID: ");
                    navigator.visitQuestion(scan.nextInt());
                    break;

                case 2:
                    navigator.goBack();
                    break;

                case 3:
                    System.out.print("Enter Question ID: ");
                    int qId = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Answer: ");
                    answerStore.submitAnswer(qId, scan.nextLine());
                    break;

                case 4:
                    int score = ScoreEvaluator.calculateScore(
                            answerStore.getAllAnswers(),
                            correctAnswers);
                    System.out.println("Final Score: " + score);
                  
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
