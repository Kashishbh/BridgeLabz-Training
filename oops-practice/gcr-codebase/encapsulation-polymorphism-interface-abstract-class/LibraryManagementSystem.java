import java.util.*;
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrowerName;
    private boolean isAvailable = true;
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public abstract int getLoanDuration();
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration (days): " + getLoanDuration());
        System.out.println("Available: " + isAvailable);
        System.out.println("---------------------------");
    }
    protected boolean isAvailable() {
        return isAvailable;
    }

    protected void setBorrower(String borrowerName) {
        this.borrowerName = borrowerName;
        this.isAvailable = false;
    }
}
class Book extends LibraryItem implements Reservable {
    public Book(String id, String title, String author) {
        super(id, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 14;
    }
    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            System.out.println("Book reserved by " + borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
class Magazine extends LibraryItem {
    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 7;
    }
}
class DVD extends LibraryItem implements Reservable {
    public DVD(String id, String title, String author) {
        super(id, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 3; 
    }
    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            System.out.println("DVD reserved by " + borrowerName);
        }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        LibraryItem book = new Book("S111", "Java Programming", "James Gosling");
        LibraryItem magazine = new Magazine("K201", "Tech Today", "Editorial Team");
        LibraryItem dvd = new DVD("R701", "Inception", "Christopher Nolan");
        items.add(book);
        items.add(magazine);
        items.add(dvd);
        for (LibraryItem item : items) {
            item.getItemDetails();
        }
        if (book instanceof Reservable) {
            Reservable reservableBook = (Reservable) book;
            reservableBook.reserveItem("Kashish");
        }
    }
}
