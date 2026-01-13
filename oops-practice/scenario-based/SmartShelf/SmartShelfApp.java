package SmartShelf;

public class SmartShelfApp {
    public static void main(String[] args) {

        SmartShelf shelf = new SmartShelf();

        shelf.addBook(new Book("Java "));
        shelf.addBook(new Book("DSA"));
        shelf.addBook(new Book("DBMS"));
        shelf.addBook(new Book("Maths"));
        shelf.addBook(new Book("Python"));

        shelf.displayShelf();
    }
}
