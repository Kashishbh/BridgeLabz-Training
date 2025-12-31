public class BookAvail {
	String title;
    String author;
    double price;
    boolean available;
    BookAvail(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; 
    }
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println(" the book is currently not available.");
        }
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + available);
    }

	public static void main(String[] args) {
		BookAvail book1 = new BookAvail("Rich Dad Poor Dad", "Robert Kiyosaki", 399);
        book1.displayDetails();
        System.out.println();
        book1.borrowBook();
        System.out.println();
        book1.borrowBook(); 
	}

}
