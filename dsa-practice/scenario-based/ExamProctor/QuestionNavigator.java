package ExamProctor;

import java.util.Stack;

class QuestionNavigator {

    private Stack<Integer> navigationStack;

    public QuestionNavigator() {
        navigationStack = new Stack<>();
    }

    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    public void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question.");
            return;
        }
        int last = navigationStack.pop();
        System.out.println("Back from Question: " + last);
    }

    public void showHistory() {
        System.out.println("Navigation Stack: " + navigationStack);
    }
}
