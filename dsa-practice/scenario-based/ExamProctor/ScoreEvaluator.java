package ExamProctor;

import java.util.Map;

class ScoreEvaluator {

    // Function to evaluate score
    public static int calculateScore(
            Map<Integer, String> studentAnswers,
            Map<Integer, String> correctAnswers) {

        int score = 0;

        for (int qId : correctAnswers.keySet()) {
            if (studentAnswers.containsKey(qId) &&
                studentAnswers.get(qId).equalsIgnoreCase(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
