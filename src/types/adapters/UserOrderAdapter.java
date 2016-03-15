package types.adapters;

import endpoint.Book;
import endpoint.UserOrder;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class UserOrderAdapter {
    private SimpleStringProperty  book;
    private SimpleIntegerProperty count;

    public UserOrderAdapter(SimpleStringProperty book, SimpleIntegerProperty count) {
        this.book = book;
        this.count = count;
    }

    public UserOrderAdapter(UserOrder userOrder) {
        this(userOrder.getBook(), userOrder.getCount());
    }

    public UserOrderAdapter(Book book, int count) {
        StringBuilder bookNameBuilder = new StringBuilder();
        bookNameBuilder.append(book.getAuthor().trim() + " - ");
        bookNameBuilder.append(book.getTitle().trim() + " (");
        bookNameBuilder.append(book.getPublishHouse().trim() + " ,");
        bookNameBuilder.append((book.getYear() == 0 ? "<не известно>" : book.getYear()) + ")");

        this.book = new SimpleStringProperty(bookNameBuilder.toString());
        this.count = new SimpleIntegerProperty(count);
    }

    public String getBook() {
        return book.get();
    }

    public SimpleStringProperty bookProperty() {
        return book;
    }

    public void setBook(String book) {
        this.book.set(book);
    }

    public int getCount() {
        return count.get();
    }

    public SimpleIntegerProperty countProperty() {
        return count;
    }

    public void setCount(int count) {
        this.count.set(count);
    }
}
