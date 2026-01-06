import java.util.*;
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void checkout() throws BookNotAvailableException {
        if (!available) {
            throw new BookNotAvailableException("Book is already checked out.");
        }
        available = false;
    }

    public void display() {
        System.out.printf("%-20s | %-15s | %s%n",
                title, author, available ? "Available" : "Checked Out");
    }
}

// Library Management
class Library {
    private List<Book> books = new ArrayList<>();

    // Add books from array
    public void addBooks(Book[] bookArray) {
        for (Book b : bookArray) {
            books.add(b);
        }
    }
    public void searchBook(String keyword) {
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                b.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found.");
        }
    }

    // Checkout book
    public void checkoutBook(String title) throws BookNotAvailableException {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.checkout();
                System.out.println("Book checked out successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooks() {
        System.out.println("\nTitle                | Author          | Status");
        for (Book b : books) {
            b.display();
        }
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        Book[] initialBooks = {
                new Book("Java Basics", "James", true),
                new Book("Data Structures", "Mark", true),
                new Book("Operating System", "Andrew", false),
                new Book("Python Guide", "Rossum", true)
        };

        library.addBooks(initialBooks);

        while (true) {
            System.out.println("\n1. Display Books");
            System.out.println("2. Search Book");
            System.out.println("3. Checkout Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        library.displayBooks();
                        break;

                    case 2:
                        System.out.print("Enter partial title: ");
                        library.searchBook(sc.nextLine());
                        break;

                    case 3:
                        System.out.print("Enter book title to checkout: ");
                        library.checkoutBook(sc.nextLine());
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (BookNotAvailableException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
