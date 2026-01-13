package LibraryManagement;

import java.time.LocalDate;

public class Transaction {
    private Book book;
    private Member member;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Transaction(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.issueDate = LocalDate.now();
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
    }

    public int getLateDays() {
        if (returnDate == null) return 0;
        return Math.max(0, returnDate.getDayOfMonth() - issueDate.getDayOfMonth() - 7);
    }
}

