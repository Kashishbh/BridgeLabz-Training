package SmartShelf;

import java.util.ArrayList;
import java.util.List;

public class SmartShelf {
    private List<Book> books;

    public SmartShelf() {
        books = new ArrayList<>();
    }

    // Real-time book addition with automatic sorting
    public void addBook(Book newBook) {
        books.add(newBook);

        // Insertion Sort logic
        int i = books.size() - 1;

        while (i > 0 &&
               books.get(i - 1).getTitle()
               .compareToIgnoreCase(newBook.getTitle()) > 0) {

            books.set(i, books.get(i - 1));
            i--;
        }
        books.set(i, newBook);
    }

    public void displayShelf() {
        System.out.println("SmartShelf (Alphabetical Order):");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
