package BookShelf;
import java.util.*;

class LibraryCatalog {

    private Map<String, LinkedList<Book>> genreMap;
    private Set<Book> bookSet;   // optional duplication control

    public LibraryCatalog() {
        genreMap = new HashMap<>();
        bookSet = new HashSet<>();
    }

    // Add book (Return / New Book)
    public void addBook(String genre, Book book) {

        if (bookSet.contains(book)) {
            System.out.println("Duplicate book not allowed.");
            return;
        }

        genreMap.putIfAbsent(genre, new LinkedList<>());
        genreMap.get(genre).add(book);
        bookSet.add(book);

        System.out.println("Book added to genre: " + genre);
    }

    // Remove book (Borrowed)
    public void removeBook(String genre, Book book) {

        if (!genreMap.containsKey(genre)) {
            System.out.println("Genre not found.");
            return;
        }

        LinkedList<Book> books = genreMap.get(genre);

        if (books.remove(book)) {
            bookSet.remove(book);
            System.out.println("Book borrowed: " + book);
        } else {
            System.out.println("Book not found in genre.");
        }

        if (books.isEmpty()) {
            genreMap.remove(genre);
        }
    }

    // Display catalog
    public void displayCatalog() {

        if (genreMap.isEmpty()) {
            System.out.println("Library catalog is empty.");
            return;
        }

        for (String genre : genreMap.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book book : genreMap.get(genre)) {
                System.out.println(" - " + book);
            }
        }
    }
}
