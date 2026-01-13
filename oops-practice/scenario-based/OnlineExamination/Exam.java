package OnlineExamination;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private int examId;
    private String subject;
    private List<Question> questions = new ArrayList<>();

    public Exam(int examId, String subject) {
        this.examId = examId;
        this.subject = subject;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
