package LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> books = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(int bookId, Member member) throws BookNotAvailableException {
        for (Book book : books) {
            if (book.getBookId() == bookId && book.isAvailable()) {
                book.issueBook();
                transactions.add(new Transaction(book, member));
                return;
            }
        }
        throw new BookNotAvailableException("Book is not available");
    }
}

