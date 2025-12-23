import java.util.Scanner;
public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int voteA = 0, voteB = 0, voteC = 0;
        while (true) {
            System.out.print("\nEnter voter age (Enter -1 to exit): ");
            int age = scan.nextInt();
            if (age == -1) {
                break;
            }
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.print("Cast your vote (1-A, 2-B, 3-C): ");
                int vote = scan.nextInt();
                switch (vote) {
                    case 1:
                        voteA++;
                        System.out.println("Vote recorded for Candidate A");
                        break;
                    case 2:
                        voteB++;
                        System.out.println("Vote recorded for Candidate B");
                        break;
                    case 3:
                        voteC++;
                        System.out.println("Vote recorded for Candidate C");
                        break;
                    default:
                        System.out.println("Invalid vote!");
                }
            } else {
                System.out.println("Not eligible to vote.");
            }
        }
        System.out.println("\nElection Results:");
        System.out.println("Candidate A Votes: " + voteA);
        System.out.println("Candidate B Votes: " + voteB);
        System.out.println("Candidate C Votes: " + voteC);
    }
}
