package types.controllers;


import endpoint.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import types.adapters.BookAdapter;
import types.adapters.BookInLibraryAdapter;
import types.adapters.UserAdapter;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Endpoint;
import java.util.*;

public class BookController {
    private static BookController instance = null;
    private static ILibrarianService port;

    public final ObservableList<BookAdapter> books;
    public final ObservableList<BookInLibraryAdapter> booksInLib;

    private BookController() {
        books = FXCollections.observableArrayList();
        booksInLib = FXCollections.observableArrayList();

        LibrarianServiceService service = new LibrarianServiceService();
        port = service.getLibrarianServicePort();
    }

    public static BookController getInstance() {
        if (instance == null)
            instance = new BookController();
        return instance;
    }

    public int addNewBook(String title, String author, String publishHouse, int pubYear) {


        int retResult = port.addNewBook(title, author, publishHouse, pubYear);
        if (retResult > 0) {
            BookAdapter bookAdapter = new BookAdapter(retResult, title, author, publishHouse, pubYear);
            books.add(bookAdapter);
        }
        return retResult;
    }

    public void updateBooksList() {
        books.clear();
        List<Book> arrayList = port.getAllBooks();
        for (Book book : arrayList) {
            BookAdapter bookAdapter = new BookAdapter(book);
            books.add(bookAdapter);
        }
    }

    public void updateBooksInLibList() {
        booksInLib.clear();
        HashMapWrapper booksInLibWrap = port.getBooksInLibrary();
        List<HashMapWrapper.BasketMap.Entry> booksInLibList = booksInLibWrap.getBasketMap().getEntry();
        for (HashMapWrapper.BasketMap.Entry entry : booksInLibList) {
            Book book = entry.getKey();
            int count = entry.getValue();
            BookInLibraryAdapter bookAdapter = new BookInLibraryAdapter(book, count);
            booksInLib.add(bookAdapter);
        }
    }

    public int purchaseBook(int bookIndex, int storeIndex, int count) {
        int bookID  = BookController.getInstance().books.get(bookIndex).getId();
        int storeID = StoreController.getInstance().stores.get(storeIndex).getId();

        GregorianCalendar c = new GregorianCalendar();
        XMLGregorianCalendar date2 = null;
        c.setTime(new Date());
        try {
            date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        }
        catch (DatatypeConfigurationException exc) {
            exc.printStackTrace();
        }
        int retResult = port.purchaseBook(bookID, storeID, count, date2);
        if (retResult == 0) {
            OperationController.getInstance().updateData();
            BookController.getInstance().updateBooksInLibList();
        }
        return retResult;
    }
}
