package types.controllers;


import endpoint.ILibrarianService;
import endpoint.LibrarianServiceService;
import endpoint.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import types.adapters.UserAdapter;

import java.util.List;
import java.util.Observable;

public class UserController {
    private static UserController instance = null;
    private static ILibrarianService port;

    public final ObservableList<UserAdapter> users;

    private UserController() {
        users = FXCollections.observableArrayList();
        LibrarianServiceService service = new LibrarianServiceService();
        port = service.getLibrarianServicePort();
    }

    public static UserController getInstance() {
        if (instance == null)
            instance = new UserController();
        return instance;
    }

    public int lockDebtor(int index) {
        int userID = users.get(index).getId();
        int result = port.lockDebtor(userID);
        if (result == 0)
            users.get(index).setAccess(false);
        return result;
    }
    public int unlockDebtor(int index) {
        int userID = users.get(index).getId();
        int result = port.unlockDebtor(userID);
        if (result == 0)
            users.get(index).setAccess(true);
        return result;
    }


    public void updateData() {
        users.clear();
        List<User> usersList = port.getUsersList();
        for (User user : usersList)
            users.add(new UserAdapter(user));
    }

}
