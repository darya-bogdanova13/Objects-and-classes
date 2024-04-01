import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int bookYear;

    public Book(String bookName, Author author, int bookYear) {
        this.bookName = bookName;
        this.author = author;
        this.bookYear = bookYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }
    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public String toString() {
        return String.valueOf(this.bookName + this.author + this.bookYear);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book that = (Book) o;
        if (bookYear != that.bookYear) {
            return false;
        }
        return Objects.equals(bookName, that.bookName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
}