package LibraryManagement;

public class Book {
    private int bookId;
    private String title;
    private boolean available;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.available = true;
    }
    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return available;
    }

    public void issueBook() {
        this.available = false;
    }

    public void returnBook() {
        this.available = true;
    }
}

