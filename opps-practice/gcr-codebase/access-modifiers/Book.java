class Book {
    public String ISBN;         
    protected String title;    
    private String author;     

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class EBook extends Book {

    private String fileFormat;

    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }
    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);      
        System.out.println("Title: " + title);    
        System.out.println("File Format: " + fileFormat);
        System.out.println("Author: " + getAuthor()); 
    }
    public static void main(String[] args) {
        Book book = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        book.displayBookDetails();

        System.out.println("------------------");
        book.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + book.getAuthor());

        System.out.println("==================");
        EBook ebook = new EBook(
                "978-0596009205",
                "Head First Java",
                "Kathy Sierra",
                "PDF"
        );
        ebook.displayEBookDetails();
    }
}
