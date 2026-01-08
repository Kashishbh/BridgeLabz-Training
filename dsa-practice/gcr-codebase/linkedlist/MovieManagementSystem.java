class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
class MovieDoublyLinkedList {
    MovieNode head;
    MovieNode tail;

    // Add at beginning
    void addAtStart(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at end
    void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add at specific position (1-based)
    void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position == 1) {
            addAtStart(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    void removeMovieByTitle(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equals(title)) {

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
    void searchByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) {
                displayMovie(temp);
            }
            temp = temp.next;
        }
    }
    void searchByRating(double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
            }
            temp = temp.next;
        }
    }
    void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }
    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }
    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }
    void displayMovie(MovieNode m) {
        System.out.println(m.title + " | " + m.director + " | " + m.year + " | " + m.rating);
    }
}
public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        list.addAtStart("Final Destination: Bloodlines", "Zach Lipovsky & Adam Stein", 2025, 8.8);
        list.addAtEnd("Dhurandhar", "Aditya Dhar", 2025, 9.5);
        list.addAtEnd("Avatar", "Cameron", 2009, 7.8);
        System.out.println("Forward Display:");
        list.displayForward();
        System.out.println("\nReverse Display:");
        list.displayReverse();
        System.out.println("\nSearch by Director (Aditya Dhar):");
        list.searchByDirector("Aditya Dhar");
        list.updateRating("Avatar", 8.0);
        list.removeMovieByTitle("Final Destination: Bloodlines");
        System.out.println("\nAfter Updates:");
        list.displayForward();
    }
}

