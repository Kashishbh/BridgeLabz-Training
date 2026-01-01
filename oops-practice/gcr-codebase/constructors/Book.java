// Book class
class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "The 5 AM Club";
        this.author = "Robin Sharma";
        this.price = 499;
    }
    public Book(String title, String author, double price) {
        this.title = title;     
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayDetails();

        System.out.println("------------------");
        Book book2 = new Book("A Brief History of Time", "Stephen Hawking", 500.0);
        book2.displayDetails();
    }
}
