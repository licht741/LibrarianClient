package types.controllers;


import endpoint.ILibrarianService;
import endpoint.LibrarianServiceService;
import endpoint.PurchaseOrder;
import endpoint.UserOrder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import types.adapters.PurchaseOrderAdapter;
import types.adapters.UserOrderAdapter;

import java.util.List;

public class PurchaseOrderController {
    private static PurchaseOrderController instance = null;
    private static ILibrarianService port;

    public final ObservableList<PurchaseOrderAdapter> userOrders;

    private PurchaseOrderController() {
        userOrders = FXCollections.observableArrayList();

        LibrarianServiceService service = new LibrarianServiceService();
        port = service.getLibrarianServicePort();
    }

    public static PurchaseOrderController getInstance() {
        if (instance == null)
            instance = new PurchaseOrderController();
        return instance;
    }

    public void updateData() {
        userOrders.clear();
        List<PurchaseOrder> purchaseOrders = port.getPurchaseOrders();
        for (PurchaseOrder uOrder : purchaseOrders) {
            PurchaseOrderAdapter userOrderAdapter = new PurchaseOrderAdapter(uOrder);
            userOrders.add(userOrderAdapter);
        }
    }
}
