import java.util.Scanner;
public class RockPaperScissor {
    static String getComputerChoice() {
        int r = (int)(Math.random() * 3);
        if (r== 0)
            return "rock";
        else if (r== 1)
            return "paper";
        else
            return "scissors";
    }
    static String findWinner(String user, String computer) {
        if (user.equals(computer))
            return "Draw";
        if (user.equals("rock") && computer.equals("scissors"))
            return "User";
        if (user.equals("paper") && computer.equals("rock"))
            return "User";
        if (user.equals("scissors") && computer.equals("paper"))
            return "User";
        return "Computer";
    }
    static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        double userPercent = (userWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) /totalGames;
        stats[0][0]= "User";
        stats[0][1]= String.valueOf(userWins);
        stats[0][2]= String.valueOf(userPercent);
        stats[1][0]= "Computer";
        stats[1][1]= String.valueOf(computerWins);
        stats[1][2]= String.valueOf(computerPercent);
        return stats;
    }
    static void displayResults(String[][] stats) {
        System.out.println("\nPlayer\tWins\tWinning %");
        for (int i= 0; i< stats.length;i++) {
            System.out.println(
                stats[i][0]+ "\t" +
                stats[i][1]+ "\t" +
                stats[i][2]
            );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games= sc.nextInt();
        int userWin= 0;
        int computerWins= 0;
        for (int i = 1; i<= games; i++) {
            System.out.print("Game " + i + " - Enter rock/paper/scissors: ");
            String userChoice= sc.next().toLowerCase();
            String computerChoice= getComputerChoice();
            String winner= findWinner(userChoice, computerChoice);
            System.out.println("Computer choice: " + computerChoice);
            System.out.println("Winner: "+winner);
            if (winner.equals("User"))
                userWin++;
            else if (winner.equals("Computer"))
                computerWins++;
        }
        String[][] stats = calculateStats(userWin, computerWins, games);
        displayResults(stats);
        sc.close();
    }
}
