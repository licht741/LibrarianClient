package types.adapters;

import endpoint.Book;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class BookInLibraryAdapter {
    private final SimpleStringProperty  bookName;
    private final SimpleIntegerProperty bookCount;

    public BookInLibraryAdapter(SimpleStringProperty bookName, SimpleIntegerProperty bookCount) {
        this.bookName = bookName;
        this.bookCount = bookCount;
    }

    public BookInLibraryAdapter(Book book, int count) {
        StringBuilder bookNameBuilder = new StringBuilder();
        bookNameBuilder.append(book.getAuthor().trim() + " - ");
        bookNameBuilder.append(book.getTitle().trim() + " (");
        bookNameBuilder.append(book.getPublishHouse().trim() + " ,");
        bookNameBuilder.append((book.getYear() == 0 ? "<не известно>" : book.getYear()) + ")");

        this.bookName = new SimpleStringProperty(bookNameBuilder.toString());
        this.bookCount = new SimpleIntegerProperty(count);
    }

    public String getBookName() {
        return bookName.get();
    }

    public SimpleStringProperty bookNameProperty() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName.set(bookName);
    }

    public int getBookCount() {
        return bookCount.get();
    }

    public SimpleIntegerProperty bookCountProperty() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount.set(bookCount);
    }
}
