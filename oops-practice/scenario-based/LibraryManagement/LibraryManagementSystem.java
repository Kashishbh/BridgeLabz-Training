package LibraryManagement;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();

        Book b1 = new Book(106, "OOPS");
        library.addBook(b1);

        Member m1 = new Member(1, "Kashish", "Student");

        try {
            library.issueBook(106, m1);
            System.out.println("Book issued successfully");
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
