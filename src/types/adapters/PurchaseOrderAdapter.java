package types.adapters;

import endpoint.PurchaseOrder;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.Date;

public class PurchaseOrderAdapter {
    private SimpleStringProperty book;
    private SimpleStringProperty shop;
    private SimpleIntegerProperty count;
    private Date date;

    public PurchaseOrderAdapter(SimpleStringProperty book, SimpleStringProperty shop, SimpleIntegerProperty count, Date date) {
        this.book = book;
        this.shop = shop;
        this.count = count;
        this.date = date;
    }

    public PurchaseOrderAdapter(PurchaseOrder purchaseOrder) {
        StringBuilder bookNameBuilder = new StringBuilder();
        bookNameBuilder.append(purchaseOrder.getBook().getAuthor().trim() + " - ");
        bookNameBuilder.append(purchaseOrder.getBook().getTitle().trim() + " (");
        bookNameBuilder.append(purchaseOrder.getBook().getPublishHouse().trim() + " ,");
        bookNameBuilder.append(purchaseOrder.getBook().getYear() + ")");

        this.book = new SimpleStringProperty(bookNameBuilder.toString());
        this.shop = new SimpleStringProperty(purchaseOrder.getShop());
        this.count = new SimpleIntegerProperty(purchaseOrder.getCount());

        if (purchaseOrder.getDate() != null) {
            int year = purchaseOrder.getDate().getYear();
            int month = purchaseOrder.getDate().getMonth();
            int day = purchaseOrder.getDate().getDay();
            this.date = new Date(year, month, day);
        }
        else
            this.date = null;
            //this.date = new Date(0, 0, 0);



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

    public String getShop() {
        return shop.get();
    }

    public SimpleStringProperty shopProperty() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop.set(shop);
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
