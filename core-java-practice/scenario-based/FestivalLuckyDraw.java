import java.util.Scanner;
class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char choice='y';
        while (choice=='y') {
            System.out.print("Enter your lucky number: ");
            int num= scan.nextInt();
            if (num<= 0) {
                System.out.println("Invalid number! Try again");
                continue;
            }
            if (num%3== 0 && num%5== 0) {
                System.out.println("Congratulations! You won a gift!");
            } else {
                System.out.println("Sorry! Better luck next time");
            }
            System.out.print("Next visitor? (y/n): ");
            choice= scan.next().charAt(0);
        }
        System.out.println("\nDiwali Mela Lucky Draw Ended ");
    }
}
