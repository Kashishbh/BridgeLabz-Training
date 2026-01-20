package ExamProctor;

import java.util.HashMap;
import java.util.Map;

class AnswerStore {

    private Map<Integer, String> answerMap;

    public AnswerStore() {
        answerMap = new HashMap<>();
    }

    public void submitAnswer(int questionId, String answer) {
        answerMap.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    public Map<Integer, String> getAllAnswers() {
        return answerMap;
    }
}
