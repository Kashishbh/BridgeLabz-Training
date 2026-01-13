package OnlineExamination;

import java.util.Arrays;
import java.util.List;

public class OnlineExaminationSystem {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Kashish");

        Exam exam = new Exam(101, "Java");
        exam.addQuestion(new Question(1, "What is DBMS?", "Database Management System"));
        exam.addQuestion(new Question(2, "What is a primary key?", "Unique Key"));

        ExamService service = new ExamService();
        service.enrollStudent(s1);

        List<String> answers = Arrays.asList("Database Management System","Unique Key");

        EvaluationStrategy strategy = new ObjectiveEvaluation();

        try {
            int score = service.submitAnswers(exam, answers, strategy, false);
            System.out.println("Result Score: " + score);
        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}
