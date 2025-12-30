import java.util.*;
class SnakeLadder {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Welcome to Snake and Ladder Game");

        // UC1 Single player starts from position 0
        int position = 0;
        int diceCount = 0;
        System.out.println("UC1: Player starts at position " + position);
        while (position != 100) {
            //UC2: Roll the die 
            int die= random.nextInt(6) + 1; // 1 to 6
            diceCount++;
            //UC3: Check option
            int option= random.nextInt(3); // 0-No Play, 1-Ladder, 2-Snake
            int previousPosition = position;
            if (option == 0) {
                // No Play
                position=position;
            } else if (option == 1) {
                // Ladder
                position=position+die;
            } else {
                // Snake
                position=position-die;
            }
            // UC4: Position should not go below 0 
            if (position<0) {
                position=0;
            }
            // UC5: Ensure exact 100 
            if (position> 100) {
                position= previousPosition;
            }
            // UC6: Report position after every die roll 
            System.out.println(
                "Dice Roll: "+die+"| Option: "+option +" | Position: " + position
            );
        }
        System.out.println("UC6: Total Dice Rolls = "+ diceCount);
        System.out.println("Player won the game!");
        
        //UC7 – Two Player Game 
        System.out.println("UC7: Two Player Game");
        int player1 = 0;
        int player2 = 0;
        int currentPlayer = 1; // 1 = Player1, 2 = Player2
        int totalDiceCount = 0;
        while (player1 != 100 && player2 != 100) {
            int die = random.nextInt(6) + 1;
            totalDiceCount++;
            int option = random.nextInt(3);
            if (currentPlayer == 1) {
                int prev = player1;
                if (option == 1) player1 += die; // Ladder
                else if (option == 2) player1 -= die; // Snake
                if (player1 < 0) player1 = 0;
                if (player1 > 100) player1 = prev;
                System.out.println(
                    "Player 1 | Dice: " + die +" | Option: " + option +" | Position: " + player1
                );
                if (option != 1) currentPlayer = 2;
            } else {
                int prev = player2;
                if (option == 1) player2 += die;
                else if (option == 2) player2 -= die;
                if (player2 < 0) player2 = 0;
                if (player2 > 100) player2 = prev;
                System.out.println(
                    "Player 2 | Dice: " + die +
                    " | Option: " + option +
                    " | Position: " + player2
                );
                if (option != 1) currentPlayer = 1;
            }
        }
        System.out.println("Total dice rolls = " + totalDiceCount);
        if (player1 == 100)
            System.out.println("Player 1 WON the game!");
        else
            System.out.println("Player 2 WON the game!");
      
    }
}
