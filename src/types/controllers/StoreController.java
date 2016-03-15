package types.controllers;


import endpoint.ILibrarianService;
import endpoint.LibrarianServiceService;
import endpoint.Store;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import types.adapters.StoreAdapter;

import java.util.List;

public class StoreController {
    private static StoreController instance = null;
    private static ILibrarianService port;

    public final ObservableList<StoreAdapter> stores;

    private StoreController() {
        stores = FXCollections.observableArrayList();

        LibrarianServiceService service = new LibrarianServiceService();
        port = service.getLibrarianServicePort();
    }

    public static StoreController getInstance() {
        if (instance == null)
            instance = new StoreController();
        return instance;
    }

    public int addStore(String name, String phone, String address) {
        int retResult = port.addNewStore(name, phone, address);
        if (retResult > 0) {
            StoreAdapter storeAdapter = new StoreAdapter(retResult, name, phone, address);
            stores.add(storeAdapter);
        }
        return retResult;
    }

    public void updateData() {
        stores.clear();
        List<Store> stores = port.getStores();
        for (Store store : stores) {
            StoreAdapter storeAdapter = new StoreAdapter(store);
            this.stores.add(storeAdapter);
        }
    }
}
