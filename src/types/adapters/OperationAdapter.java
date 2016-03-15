package types.adapters;

import endpoint.Operation;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;


/*
 * Адаптер над серверным классом Operation
 * В JavaFX предпочтительно использовать Properties для полей класса-модели
 * Это позволяет автоматически обновлять данные, показываемые пользователю
 */

public class OperationAdapter {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private SimpleStringProperty user;
    private SimpleStringProperty book;
    private java.util.Date receivedDate;

    private java.util.Date deadline;

    private SimpleStringProperty receivedDateFormat;
    private SimpleStringProperty deadlineDateFormat;

    public OperationAdapter(SimpleStringProperty user, SimpleStringProperty book, Date receivedDate, Date deadline, SimpleBooleanProperty isClosed) {
        this.user = user;
        this.book = book;
        this.receivedDate = receivedDate;
        this.deadline = deadline;
    }

    public OperationAdapter(Operation operation) {
        this.id = operation.getId();
        this.user = new SimpleStringProperty(operation.getUser());

        StringBuilder bookNameBuilder = new StringBuilder();
        bookNameBuilder.append(operation.getBook().getAuthor().trim() + " - ");
        bookNameBuilder.append(operation.getBook().getTitle().trim() + " (");
        bookNameBuilder.append(operation.getBook().getPublishHouse().trim() + " ,");
        bookNameBuilder.append(operation.getBook().getYear() + ")");

        this.book = new SimpleStringProperty(bookNameBuilder.toString());

        this.receivedDate = operation.getReceivedDate().toGregorianCalendar().getTime();
        this.deadline = operation.getDeadline().toGregorianCalendar().getTime();

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

    public String getReceivedDateFormat() {
        SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
        receivedDateFormat = new SimpleStringProperty(dt.format(receivedDate));
        return receivedDateFormat.get();
    }

    public SimpleStringProperty receivedDateFormatProperty() {
        SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
        receivedDateFormat = new SimpleStringProperty(dt.format(receivedDate));
        return receivedDateFormat;
    }

    public void setReceivedDateFormat(String receivedDateFormat) {
        this.receivedDateFormat.set(receivedDateFormat);
    }

    public String getDeadlineDateFormat() {
        SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
        deadlineDateFormat = new SimpleStringProperty(dt.format(deadline));
        return deadlineDateFormat.get();
    }

    public SimpleStringProperty deadlineDateFormatProperty() {
        SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
        deadlineDateFormat = new SimpleStringProperty(dt.format(deadline));
        return deadlineDateFormat;
    }

    public void setDeadlineDateFormat(String deadlineDateFormat) {
        this.deadlineDateFormat.set(deadlineDateFormat);
    }
}
