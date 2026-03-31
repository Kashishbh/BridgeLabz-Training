class BookNode {
    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;
    BookNode next;
    BookNode prev;
    BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
class LibraryList {
    BookNode head;
    BookNode tail;
    void addAtStart(int id, String title, String author, String genre, boolean status) {
        BookNode newNode = new BookNode(id, title, author, genre, status);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    void addAtEnd(int id, String title, String author, String genre, boolean status) {
        BookNode newNode = new BookNode(id, title, author, genre, status);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    void removeById(int id) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head) {
                    head = head.next;
                    if (head != null)
                        head.prev = null;
                }
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }
    void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                displayBook(temp);
            }
            temp = temp.next;
        }
    }
    void searchByAuthor(String author) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equals(author)) {
                displayBook(temp);
            }
            temp = temp.next;
        }
    }
    void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }
    void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }
    void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }
    void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Books: " + count);
    }

    void displayBook(BookNode b) {
        System.out.println(
            b.bookId + " " +
            b.title + " " +
            b.author + " " +
            b.genre + " " +
            (b.isAvailable ? "Available" : "Issued")
        );
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryList library = new LibraryList();
        library.addAtStart(1, "Java Basics", "James Gosling", "Programming", true);
        library.addAtEnd(2, "Data Structures", "Mark Allen", "CS", true);
        library.addAtEnd(3, "Operating Systems", "Galvin", "CS", false);
        library.displayForward();
        library.searchByAuthor("Galvin");
        library.updateAvailability(3, true);
        System.out.println("Reverse Order:");
        library.displayReverse();
        library.countBooks();
    }
}
