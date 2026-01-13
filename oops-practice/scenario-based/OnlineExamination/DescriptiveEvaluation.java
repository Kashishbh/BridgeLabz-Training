package OnlineExamination;

import java.util.List;

public class DescriptiveEvaluation implements EvaluationStrategy {
    @Override
    public int evaluate(List<Question> questions, List<String> answers) {
        // Manual or fixed evaluation logic
        return answers.size() * 2;
    }
}
