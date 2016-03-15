package types.adapters;


import endpoint.Book;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class BookAdapter {
    private final int id;
    private final SimpleStringProperty title;
    private final SimpleStringProperty author;
    private final SimpleStringProperty publishHouse;
    private final SimpleIntegerProperty year;
    private final SimpleIntegerProperty count;

    public BookAdapter(int id, SimpleStringProperty title, SimpleStringProperty author,
                       SimpleStringProperty publishHouse, SimpleIntegerProperty year, SimpleIntegerProperty count) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishHouse = publishHouse;
        this.year = year;
        this.count = count;
    }

    public BookAdapter(Book book) {
        this.id = book.getId();
        this.title = new SimpleStringProperty(book.getTitle().trim());
        this.author = new SimpleStringProperty(book.getAuthor().trim());
        this.publishHouse = new SimpleStringProperty(book.getPublishHouse().trim());
        this.year = new SimpleIntegerProperty(book.getYear());
        this.count = new SimpleIntegerProperty(0);
    }

    public BookAdapter(Book book, int count) {
        this.id = book.getId();
        this.title = new SimpleStringProperty(book.getTitle().trim());
        this.author = new SimpleStringProperty(book.getAuthor().trim());
        this.publishHouse = new SimpleStringProperty(book.getPublishHouse().trim());
        this.year = new SimpleIntegerProperty(book.getYear());
        this.count = new SimpleIntegerProperty(count);
    }

    public BookAdapter(int id, String title, String author, String publishHouse, Integer year) {
        this.id = id;
        this.title = new SimpleStringProperty(title.trim());
        this.author = new SimpleStringProperty(author.trim());
        this.publishHouse = new SimpleStringProperty(publishHouse.trim());
        this.year = new SimpleIntegerProperty(year);
        this.count = new SimpleIntegerProperty(0);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title.get();
    }

    public SimpleStringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getAuthor() {
        return author.get();
    }

    public SimpleStringProperty authorProperty() {
        return author;
    }

    public void setAuthor(String author) {
        this.author.set(author);
    }

    public String getPublishHouse() {
        return publishHouse.get();
    }

    public SimpleStringProperty publishHouseProperty() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse.set(publishHouse);
    }

    public int getYear() {
        return year.get();
    }

    public SimpleIntegerProperty yearProperty() {
        return year.get() == 0 ? null : year;
    }

    public void setYear(int year) {
        this.year.set(year);
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

    @Override
    public String toString() {
        StringBuilder bookNameBuilder = new StringBuilder();
        bookNameBuilder.append(author.get().trim() + " - ");
        bookNameBuilder.append(title.get().trim() + " (");
        bookNameBuilder.append((year.get() == 0 ? "<не известно>" : year.get()) + ")");
        bookNameBuilder.append(year.get() + ")");
        return bookNameBuilder.toString();
    }
}
