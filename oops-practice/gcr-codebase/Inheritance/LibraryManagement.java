public class LibraryManagement{
    static class Book {
        private String title;
        private int publicationYear;
        public Book(String title, int publicationYear) {
            this.title = title;
            this.publicationYear = publicationYear;
        }
        public String getTitle() {
            return title;
        }
        public int getPublicationYear() {
            return publicationYear;
        }
        public void displayInfo() {
            System.out.println("Book Title: " + title);
            System.out.println("Publication Year: " + publicationYear);
        }
    }
    static class Author extends Book {
        private String name;
        private String bio;
        public Author(String title, int publicationYear, String name, String bio) {
            super(title, publicationYear);
            this.name = name;
            this.bio = bio;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Author Name: " + name);
            System.out.println("Author Bio: " + bio);
        }
    }
    public static void main(String[] args) {
        Book book = new Author(
                "The Alchemist",1988,"Paulo Coelho","Brazilian author best known for his philosophical novels that focus on self-discovery"
        );

        book.displayInfo();
    }
}
