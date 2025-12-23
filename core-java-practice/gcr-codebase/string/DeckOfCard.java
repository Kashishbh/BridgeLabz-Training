import java.util.Scanner;
public class DeckOfCard{
    static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards= suits.length * ranks.length;
        String[] deck= new String[numOfCards];
        int index= 0;
        for (int i= 0; i< suits.length;i++) {
            for (int j= 0; j< ranks.length; j++) {
                deck[index]= ranks[j]+" of "+suits[i];
                index++;
            }
        }
        return deck;
    }
    static String[] shuffleDeck(String[] deck) {
        int n= deck.length;
        for (int i=0; i<n;i++) {
            int randomCardNumber= i + (int) (Math.random() * (n - i));
            String temp= deck[i];
            deck[i]= deck[randomCardNumber];
            deck[randomCardNumber]= temp;
        }
        return deck;
    }
    static String[][] distributeCard(String[] deck, int players, int cardsPerPlayer) {
        int totalCardsNeeded= players*cardsPerPlayer;
        if (totalCardsNeeded>deck.length) {
            return null;
        }
        String[][] playerCard= new String[players][cardsPerPlayer];
        int index= 0;
        for (int i= 0; i< players;i++) {
            for (int j=0; j<cardsPerPlayer;j++) {
                playerCard[i][j]=deck[index];
                index++;
            }
        }
        return playerCard;
    }
    static void printPlayer(String[][] players) {
        for (int i= 0; i< players.length;i++) {
            System.out.println("\nPlayer " + (i+1)+" cards:");
            for (int j=0; j<players[i].length;j++) {
                System.out.println(players[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String[] suit= {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] rank= {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};
        String[] deck= initializeDeck(suit, rank);
        deck= shuffleDeck(deck);
        System.out.print("Enter number of players: ");
        int players= scan.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer= scan.nextInt();
        String[][] distributedCards = distributeCard(deck, players, cardsPerPlayer);
        if (distributedCards== null) {
            System.out.println("Cards cannot be distributed to players.");
        } else {
            printPlayer(distributedCards);
        }
    }
}
