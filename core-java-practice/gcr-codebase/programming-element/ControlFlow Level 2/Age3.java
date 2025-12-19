import java.util.Scanner;
class Age3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ageAmar = scan.nextInt();
        int ageAkbar = scan.nextInt();
        int ageAnthony = scan.nextInt();
        int heightAmar = scan.nextInt();
        int heightAkbar = scan.nextInt();
        int heightAnthony = scan.nextInt();
        if (ageAmar < ageAkbar && ageAmar < ageAnthony)
            System.out.println("Amar is youngest");
        else if (ageAkbar < ageAmar && ageAkbar < ageAnthony)
            System.out.println("Akbar is youngest");
        else
            System.out.println("Anthony is youngest");
        if (heightAmar > heightAkbar && heightAmar > heightAnthony)
            System.out.println("Amar is tallest");
        else if (heightAkbar > heightAmar && heightAkbar > heightAnthony)
            System.out.println("Akbar is tallest");
        else
            System.out.println("Anthony is tallest");
    }
}
