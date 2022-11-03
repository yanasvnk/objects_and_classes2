import java.util.Objects;
public class Book {
    private final String bookName;
    private final Author author;

    private int publishYear;

    public Book (String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }
    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }
    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Книга - " + bookName + ", " + author + "," + " год издания - " + publishYear + ".";
    }

    @Override
    public int hashCode () {
        return Objects.hash(bookName, author, publishYear);
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return publishYear == book.publishYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }
}

