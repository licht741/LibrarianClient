package sample;

import endpoint.Book;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import types.adapters.*;
import types.controllers.*;
import types.AlertBuilders.*;

import java.util.Calendar;
import java.util.Date;

public class Controller {

    /*
     *
     * Привязка используемых элементов управления
     * Id элементов задаются в файле разметки .fxml
     *
     */

    /*
     * Элементы вкладки "Пользователи"
     */

    @FXML
    private TableView usersTable;

    @FXML
    private Button enableUserButton;
    @FXML
    private Button disableUserButton;

    @FXML
    private TableColumn userLoginColumn;
    @FXML
    private TableColumn userNameColumn;
    @FXML
    private TableColumn userAccessColumn;

    /*
     * Элементы вкладки "Список книг"
     */

    @FXML
    private TableView booksTable;
    @FXML
    private TableView booksInLibraryTable;

    @FXML
    private TableColumn bookNameColumn;
    @FXML
    private TableColumn bookAuthorColumn;
    @FXML
    private TableColumn bookPubHouseColumn;
    @FXML
    private TableColumn bookYearColumn;

    @FXML
    private TableColumn bookInLibNameColumn;
    @FXML
    private TableColumn bookInLibCountColumn;

    /*
     * Элементы вкладки "Заказы"
     */

    @FXML
    private TableView usersOrderTable;
    @FXML
    private TableView PurchaseBookTable;

    @FXML
    private TableColumn usersOrderBookColumn;
    @FXML
    private TableColumn usersOrderCountColumn;
    @FXML
    private TableColumn PurchaseBookNameColumn;
    @FXML
    private TableColumn PurchaseBookCountColumn;
    @FXML
    private TableColumn PurchaseBookStoreColumn;
    @FXML
    private TableColumn PurchaseBookDateColumn;

    /*
     * Элементы вкладки "Взятые книги"
     */

    @FXML
    private TableView takingBookTable;

    @FXML
    private TableColumn takingBookUser;
    @FXML
    private TableColumn takingBookBook;
    @FXML
    private TableColumn takingBookRecData;
    @FXML
    private TableColumn takingBookDeadline;


    @FXML
    private Button addNewBookButton;

    @FXML
    private TextField newBookTitleTextField;
    @FXML
    private TextField newBookAuthorTextField;
    @FXML
    private TextField newBookPubHouseTextField;
    @FXML
    private TextField newBookYearTextField;

    @FXML
    private Button makePurchaseButton;

    //@FXML
    //private TextField countBooksTextField;

    @FXML
    private TableView ShopesTableView;
    @FXML
    private TableColumn shopNameColumn;
    @FXML
    private TableColumn phoneNameColumn;
    @FXML
    private TableColumn shopAddressColumn;

    @FXML
    private ListView booksList;

    @FXML
    private TextField shopNameTextField;
    @FXML
    private TextField shopPhoneTextField;
    @FXML
    private TextField shopAddressTextField;
    @FXML
    private TextField countBooksTextField;

    @FXML
    private TextField authLoginTextField;
    @FXML
    private TextField authPasswordTextField;
    @FXML
    private TextField authNameTextField;

    @FXML
    private Tab usersTab;
    @FXML
    private Tab booksListTab;
    @FXML
    private Tab ordersTab;
    @FXML
    private Tab usersOrdersTab;
    @FXML
    private Tab booksPurchaseTab;

    @FXML
    private void addNewBookHandler() {

        String title = newBookTitleTextField.getText();
        String author = newBookAuthorTextField.getText();
        String pubHouse = newBookPubHouseTextField.getText();
        String pubYear_str = newBookYearTextField.getText();
        Integer pubYear = null;

        try {
            pubYear = Integer.parseInt(pubYear_str);
        }
        catch (NumberFormatException e) {
            NewBookAdditionAlertBuilder.getInvalidBookDataAlert().showAndWait();
            return;
        }

        boolean anyFieldIsEmpty = title.isEmpty() || author.isEmpty() || pubHouse.isEmpty();
        boolean notValidPublishYear = pubYear < 0 || pubYear > Calendar.getInstance().get(Calendar.YEAR);
        if (anyFieldIsEmpty || notValidPublishYear) {
            NewBookAdditionAlertBuilder.getInvalidBookDataAlert().showAndWait();
            return;
        }
        int result = BookController.getInstance().addNewBook(title, author, pubHouse, pubYear);
        int temp = 0;

    }

    @FXML
    private void addNewStoreHandler() {
        String name = shopNameTextField.getText();
        String phone = shopPhoneTextField.getText();
        String address = shopAddressTextField.getText();

        int result = StoreController.getInstance().addStore(name, phone, address);
        if (result == 0)
            AddNewStoreAlertBuilder.getInvalidAdditionStoreAlert().showAndWait();

    }

    @FXML
    private void makePurchaseHandler() {
        int bookIndex = booksList.getSelectionModel().getSelectedIndex();
        if (bookIndex < 0) {
            MakeOrderAlertBuilder.getBookIsNotSelectedAlert().showAndWait();
            return;
        }
        int shopIndex = ShopesTableView.getSelectionModel().getSelectedIndex();
        if (shopIndex < 0) {
            MakeOrderAlertBuilder.getShopIsNotSelectedAlert().showAndWait();
            return;
        }

        String count_str = countBooksTextField.getText();
        Integer count = 0;
        try {
            count = Integer.parseInt(count_str);
        }
        catch (NumberFormatException exc) {
            MakeOrderAlertBuilder.getInvalidBookCountAlert().showAndWait();
        }

        if (count <= 0)
            MakeOrderAlertBuilder.getInvalidBookCountAlert().showAndWait();

        int retResult = BookController.getInstance().purchaseBook(bookIndex, shopIndex, count);
        int temp = 0;
    }
//    @FXML
//    private void makeOrderHandler() {
//        int index = booksTable.getSelectionModel().getSelectedIndex();
//        if (index < 0) {
//            MakeOrderAlertBuilder.getBookIsNotSelectedAlert().showAndWait();
//            return;
//        }
//        String count_str = newBookCountTextField.getText();
//        Integer count = 0;
//        try {
//            count = Integer.parseInt(count_str);
//        }
//        catch (NumberFormatException exc) {
//            MakeOrderAlertBuilder.getInvalidBookCountAlert().showAndWait();
//        }
//
//        if (count <= 0)
//
//        BookController.getInstance().purchaseBook(index,)
//    }

    @FXML
    private void lockDebtorButtonHandler() {
        int index = usersTable.getSelectionModel().getSelectedIndex();
        if (index < 0) {
            MakeOrderAlertBuilder.getBookIsNotSelectedAlert().showAndWait();
            return;
        }
        int result = UserController.getInstance().lockDebtor(index);
        if (result < 0)
            MakeOrderAlertBuilder.getBookIsNotSelectedAlert().showAndWait();

    }

    @FXML
    private void unlockDebtorButtonHandler() {
        int index = usersTable.getSelectionModel().getSelectedIndex();
        if (index < 0) {
            MakeOrderAlertBuilder.getBookIsNotSelectedAlert().showAndWait();
            return;
        }
        int result = UserController.getInstance().unlockDebtor(index);
        if (result < 0)
            MakeOrderAlertBuilder.getBookIsNotSelectedAlert().showAndWait();
    }

    @FXML
    private void initialize() {

        UserController.getInstance().updateData();
        BookController.getInstance().updateData();
        UserOrderController.getInstance().updateData();
        PurchaseOrderController.getInstance().updateData();
        OperationController.getInstance().updateData();
        StoreController.getInstance().updateData();

        initializeUserTable();

        initializeBookTable();
        initializeBookInLibTable();
        initializeUserOrdersTable();
        initalizePurchaseOrdersTable();
        initializeTakingBookTable();
        initializeStoreTable();

    }

    @FXML
    private void regButtonHandler() {
        String login = authLoginTextField.getText();
        String password = authPasswordTextField.getText();
        String name = authNameTextField.getText();
        int result;
        try {
            result = AuthorizationController.getInstance().registration(login, password, name);
        }
        catch (javax.xml.ws.WebServiceException exc) {
            AlertAppDialogBuilder.getConnectionErrorAlert().showAndWait();
            return;
        }

        switch (result) {
            case -1:
                AlertRegistrationDialogBuilder.getExistingLoginErrorAlert().showAndWait();
                break;
            case -2:
                AlertRegistrationDialogBuilder.getInvalidInputDataErrorAlert().showAndWait();
                break;
            case -3:
                AlertRegistrationDialogBuilder.getSystemErrorAlert().showAndWait();
                break;
            case 0:
                authButtonHandler();
        }
    }

    /*
     * Обработчик авторизации пользователя
     * Работа с базой данных делегируется AuthorizationController
     */

    @FXML
    private void authButtonHandler() {
        String login = authLoginTextField.getText();
        String passwd = authPasswordTextField.getText();

        int result;

        try {
            result = AuthorizationController.getInstance().authorization(login, passwd);
        }
        catch (javax.xml.ws.WebServiceException exc) {
            AlertAppDialogBuilder.getConnectionErrorAlert().showAndWait();
            return;
        }

        switch (result) {
            case -1:
                AlertAuthorizationDialogBuilder.getAuthErrorAlert().showAndWait();
                break;
            case -2:
                AlertAuthorizationDialogBuilder.getUserDisabledAlert().showAndWait();
                break;
            case -3:
                AlertAuthorizationDialogBuilder.getSystemErrorAlert().showAndWait();
                break;
            case 0:
                AlertAuthorizationDialogBuilder.getAuthSuccessAlert();
                authModeEnable();
        }
    }

    private void authModeEnable() {
        usersTab.setDisable(false);
        booksListTab.setDisable(false);
        ordersTab.setDisable(false);
        usersOrdersTab.setDisable(false);
        booksPurchaseTab.setDisable(false);
    }

    private void initializeStoreTable() {

        shopNameColumn.setCellValueFactory(new PropertyValueFactory<StoreAdapter, String>("name"));
        phoneNameColumn.setCellValueFactory(new PropertyValueFactory<StoreAdapter, String>("phone"));
        shopAddressColumn.setCellValueFactory(new PropertyValueFactory<StoreAdapter, String>("address"));
        ShopesTableView.setItems(StoreController.getInstance().stores);

        booksList.setItems(BookController.getInstance().books);
    }

    private void initializeUserTable() {
        userLoginColumn.setCellValueFactory(new PropertyValueFactory<UserAdapter, String>("login"));
        userNameColumn.setCellValueFactory(new PropertyValueFactory<UserAdapter, String>("name"));
        userAccessColumn.setCellValueFactory(new PropertyValueFactory<UserAdapter, Boolean>("access"));
        usersTable.setItems(UserController.getInstance().users);
    }
    private void initializeBookTable() {
        bookNameColumn.setCellValueFactory(new PropertyValueFactory<BookAdapter, String>("title"));
        bookAuthorColumn.setCellValueFactory(new PropertyValueFactory<BookAdapter, String>("author"));
        bookPubHouseColumn.setCellValueFactory(new PropertyValueFactory<BookAdapter, String>("publishHouse"));
        bookYearColumn.setCellValueFactory(new PropertyValueFactory<BookAdapter, Integer>("year"));
        booksTable.setItems(BookController.getInstance().books);
    }

    private void initializeBookInLibTable() {
        bookInLibNameColumn.setCellValueFactory(new PropertyValueFactory<BookInLibraryAdapter, String>("bookName"));
        bookInLibCountColumn.setCellValueFactory(new PropertyValueFactory<BookInLibraryAdapter, Integer>("bookCount"));
        booksInLibraryTable.setItems(BookController.getInstance().booksInLib);
    }

    private void initializeUserOrdersTable() {
        usersOrderBookColumn.setCellValueFactory(new PropertyValueFactory<UserOrderAdapter, String>("book"));
        usersOrderCountColumn.setCellValueFactory(new PropertyValueFactory<UserOrderAdapter, Integer>("count"));
        usersOrderTable.setItems(UserOrderController.getInstance().userOrders);
    }

    private void initalizePurchaseOrdersTable() {
        PurchaseBookNameColumn.setCellValueFactory(new PropertyValueFactory<PurchaseOrderAdapter, String>("book"));
        PurchaseBookCountColumn.setCellValueFactory(new PropertyValueFactory<PurchaseOrderAdapter, Integer>("count"));
        PurchaseBookStoreColumn.setCellValueFactory(new PropertyValueFactory<PurchaseOrderAdapter, String>("shop"));
        PurchaseBookDateColumn.setCellValueFactory(new PropertyValueFactory<PurchaseOrderAdapter, Integer>("date"));
        PurchaseBookTable.setItems(PurchaseOrderController.getInstance().userOrders);
    }

    private void initializeTakingBookTable() {
        takingBookUser.setCellValueFactory(new PropertyValueFactory<OperationAdapter, String>("user"));
        takingBookBook.setCellValueFactory(new PropertyValueFactory<OperationAdapter, String>("book"));
        takingBookRecData.setCellValueFactory(new PropertyValueFactory<OperationAdapter, Date>("receivedDate"));
        takingBookDeadline.setCellValueFactory(new PropertyValueFactory<OperationAdapter, Date>("deadline"));
        takingBookTable.setItems(OperationController.getInstance().operationAdapters);
    }


}
