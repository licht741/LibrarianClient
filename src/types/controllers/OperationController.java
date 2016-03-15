package types.controllers;

import endpoint.ILibrarianService;
import endpoint.LibrarianServiceService;
import endpoint.Operation;
import endpoint.PurchaseOrder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import types.adapters.OperationAdapter;
import types.adapters.PurchaseOrderAdapter;

import java.util.List;

public class OperationController {
    private static OperationController instance = null;
    private static ILibrarianService port;

    public final ObservableList<OperationAdapter> operationAdapters;

    private OperationController() {
        operationAdapters = FXCollections.observableArrayList();

        LibrarianServiceService service = new LibrarianServiceService();
        port = service.getLibrarianServicePort();
    }

    public static OperationController getInstance() {
        if (instance == null)
            instance = new OperationController();
        return instance;
    }

    public void updateData() {
        operationAdapters.clear();
        List<Operation> operations = port.getBookOperations();
        for (Operation oper : operations) {
            OperationAdapter userOrderAdapter = new OperationAdapter(oper);
            operationAdapters.add(userOrderAdapter);
        }
    }
}
