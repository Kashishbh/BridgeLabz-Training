import java.util.Random;
import java.util.Scanner;
class NumGuessGame{
    static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }
    static char getUserFeedback(Scanner scan) {
        System.out.print("Enter feedback (h = high, l = low, c = correct): ");
        return scan.next().charAt(0);
    }
    static void updateRange(char feedback, int guess, int[] range) {
        if (feedback == 'h') {
            range[1] = guess - 1;
        } else if (feedback == 'l') {
            range[0] = guess + 1;
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int low= 1, high= 100;
        int[] range = {low, high};
        boolean guessedCorrect= false;
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Computer will try to guess it!");
        while (!guessedCorrect) {
            int guess = generateGuess(range[0], range[1]);
            System.out.println("\nComputer guesses: "+ guess);
            char feedback = getUserFeedback(scan);
            if (feedback=='c') {
                System.out.println("Computer guessed your number correctly!");
                guessedCorrect= true;
            } 
            else if (feedback == 'h' || feedback == 'l') {
                updateRange(feedback, guess, range);
            } 
            else {
                System.out.println("Invalid input! Please enter h, l, or c.");
            }
        }
    }
}
