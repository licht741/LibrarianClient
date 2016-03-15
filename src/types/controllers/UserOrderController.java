package types.controllers;


import endpoint.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import types.adapters.BookAdapter;
import types.adapters.BookInLibraryAdapter;
import types.adapters.UserOrderAdapter;

import java.util.List;

public class UserOrderController {
    private static UserOrderController instance = null;
    private static ILibrarianService port;

    public final ObservableList<UserOrderAdapter> userOrders;

    private UserOrderController() {
        userOrders = FXCollections.observableArrayList();

        LibrarianServiceService service = new LibrarianServiceService();
        port = service.getLibrarianServicePort();
    }

    public static UserOrderController getInstance() {
        if (instance == null)
            instance = new UserOrderController();
        return instance;
    }

    public void updateData() {
        userOrders.clear();
        List<UserOrder> userOrdersList = port.getUserOrders();
        for (UserOrder uOrder : userOrdersList) {
            UserOrderAdapter userOrderAdapter = new UserOrderAdapter(uOrder);
            userOrders.add(userOrderAdapter);
        }
    }
}
