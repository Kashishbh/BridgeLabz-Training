package CinemaTime;

import java.util.Scanner;

public class CinemaTimeApp {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        CinemaManager manager = new CinemaManager();

        while (true) {
            System.out.println("\nCinemaTime Menu --");
            System.out.println("1. Add Movie");
            System.out.println("2. Search Movie");
            System.out.println("3. Display All Movies");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scan.nextInt();
            scan.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter title: ");
                        String title = scan.nextLine();
                        System.out.print("Enter showtime (HH:MM): ");
                        String time = scan.nextLine();
                        manager.addMovie(title, time);
                        break;

                    case 2:
                        System.out.print("Enter keyword: ");
                        manager.searchMovie(scan.nextLine());
                        break;

                    case 3:
                        manager.displayAllMovies();
                        break;

                    case 4:
                        String[] report = manager.generateReport();
                        System.out.println(" Printable Report --");
                        for (String entry : report) {
                            System.out.println(entry);
                        }
                        break;

                    case 5:
                        System.out.println("Cinema system closed.");
                        scan.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (InvalidTimeFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
       