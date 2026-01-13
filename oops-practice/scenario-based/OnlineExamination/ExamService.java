package OnlineExamination;

import java.util.ArrayList;
import java.util.List;

public class ExamService {
    private List<Student> enrolledStudents = new ArrayList<>();

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public int submitAnswers(
            Exam exam,
            List<String> answers,
            EvaluationStrategy strategy,
            boolean timeExpired
    ) throws ExamTimeExpiredException {

        if (timeExpired) {
            throw new ExamTimeExpiredException("Exam time expired!");
        }
        return strategy.evaluate(exam.getQuestions(), answers);
    }
}
