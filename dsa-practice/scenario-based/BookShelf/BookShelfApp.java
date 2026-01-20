package BookShelf;

import java.util.Scanner;

public class BookShelfApp {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        LibraryCatalog catalog = new LibraryCatalog();

        while (true) {
            System.out.println("\nLibrary Menu --");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Display Catalog");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Genre: ");
                    String genre = scan.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scan.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scan.nextLine();

                    catalog.addBook(genre, new Book(title, author));
                    break;

                case 2:
                    System.out.print("Enter Genre: ");
                    genre = scan.nextLine();
                    System.out.print("Enter Title: ");
                    title = scan.nextLine();
                    System.out.print("Enter Author: ");
                    author = scan.nextLine();

                    catalog.removeBook(genre, new Book(title, author));
                    break;

                case 3:
                    catalog.displayCatalog();
                    break;

                case 4:
                    System.out.println("Library closed.");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
