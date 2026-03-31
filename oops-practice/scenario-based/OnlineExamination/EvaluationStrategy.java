package OnlineExamination;

import java.util.List;

public interface EvaluationStrategy {
    int evaluate(List<Question> questions, List<String> answers);
}
