package types.adapters;

import endpoint.Operation;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.Date;

public class OperationAdapter {
    private SimpleStringProperty user;
    private SimpleStringProperty book;
    private Date receivedDate;
    private Date deadline;

    public OperationAdapter(SimpleStringProperty user, SimpleStringProperty book, Date receivedDate, Date deadline, SimpleBooleanProperty isClosed) {
        this.user = user;
        this.book = book;
        this.receivedDate = receivedDate;
        this.deadline = deadline;
    }

    public OperationAdapter(Operation operation) {
        this.user = new SimpleStringProperty(operation.getUser());
        StringBuilder bookNameBuilder = new StringBuilder();
        bookNameBuilder.append(operation.getBook().getAuthor().trim() + " - ");
        bookNameBuilder.append(operation.getBook().getTitle().trim() + " (");
        bookNameBuilder.append(operation.getBook().getPublishHouse().trim() + " ,");
        bookNameBuilder.append((operation.getBook().getYear() == 0 ? "<не указано>" : operation.getBook().getYear()) + ")");

        this.book = new SimpleStringProperty(bookNameBuilder.toString());

        int year = operation.getReceivedDate().getYear();
        int month = operation.getReceivedDate().getMonth();
        int day = operation.getReceivedDate().getDay();

        this.receivedDate = operation.getReceivedDate() == null ?
            new Date(year, month, day) :
                null;

        year = operation.getDeadline().getYear();
        month = operation.getDeadline().getMonth();
        day = operation.getDeadline().getDay();

        this.deadline = operation.getDeadline() == null ?
                new Date(year, month, day) :
                null;

    }

    public String getUser() {
        return user.get();
    }

    public SimpleStringProperty userProperty() {
        return user;
    }

    public void setUser(String user) {
        this.user.set(user);
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

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
