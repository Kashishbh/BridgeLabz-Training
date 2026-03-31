import java.util.Scanner;
public class SelectionSortExamScores {
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Find min element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap minimum element with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scan.nextInt();
        int[] examScores = new int[n];
        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            examScores[i] = scan.nextInt();
        }
        selectionSort(examScores);
        System.out.println("Sorted Exam Scores (Ascending):");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}
