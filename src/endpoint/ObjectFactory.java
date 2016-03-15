
package endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the endpoint package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindDebtors_QNAME = new QName("http://endpoint/", "findDebtors");
    private final static QName _AddNewStore_QNAME = new QName("http://endpoint/", "addNewStore");
    private final static QName _LockDebtor_QNAME = new QName("http://endpoint/", "lockDebtor");
    private final static QName _AddNewBook_QNAME = new QName("http://endpoint/", "addNewBook");
    private final static QName _RegistrationResponse_QNAME = new QName("http://endpoint/", "registrationResponse");
    private final static QName _Registration_QNAME = new QName("http://endpoint/", "registration");
    private final static QName _GetStoresResponse_QNAME = new QName("http://endpoint/", "getStoresResponse");
    private final static QName _GetUserOrders_QNAME = new QName("http://endpoint/", "getUserOrders");
    private final static QName _AddNewBookResponse_QNAME = new QName("http://endpoint/", "addNewBookResponse");
    private final static QName _PurchaseBookResponse_QNAME = new QName("http://endpoint/", "purchaseBookResponse");
    private final static QName _GetPurchaseOrders_QNAME = new QName("http://endpoint/", "getPurchaseOrders");
    private final static QName _AddNewStoreResponse_QNAME = new QName("http://endpoint/", "addNewStoreResponse");
    private final static QName _AuthorizationResponse_QNAME = new QName("http://endpoint/", "authorizationResponse");
    private final static QName _UnlockDebtor_QNAME = new QName("http://endpoint/", "unlockDebtor");
    private final static QName _FindDebtorsResponse_QNAME = new QName("http://endpoint/", "findDebtorsResponse");
    private final static QName _UnlockDebtorResponse_QNAME = new QName("http://endpoint/", "unlockDebtorResponse");
    private final static QName _GetUserOrdersResponse_QNAME = new QName("http://endpoint/", "getUserOrdersResponse");
    private final static QName _GetUsersList_QNAME = new QName("http://endpoint/", "getUsersList");
    private final static QName _GetBooksInLibraryResponse_QNAME = new QName("http://endpoint/", "getBooksInLibraryResponse");
    private final static QName _GetAllBooksResponse_QNAME = new QName("http://endpoint/", "getAllBooksResponse");
    private final static QName _GetUsersListResponse_QNAME = new QName("http://endpoint/", "getUsersListResponse");
    private final static QName _GetBookOperationsResponse_QNAME = new QName("http://endpoint/", "getBookOperationsResponse");
    private final static QName _GetBookOperations_QNAME = new QName("http://endpoint/", "getBookOperations");
    private final static QName _GetAllBooks_QNAME = new QName("http://endpoint/", "getAllBooks");
    private final static QName _Authorization_QNAME = new QName("http://endpoint/", "authorization");
    private final static QName _LockDebtorResponse_QNAME = new QName("http://endpoint/", "lockDebtorResponse");
    private final static QName _GetBooksInLibrary_QNAME = new QName("http://endpoint/", "getBooksInLibrary");
    private final static QName _GetPurchaseOrdersResponse_QNAME = new QName("http://endpoint/", "getPurchaseOrdersResponse");
    private final static QName _PurchaseBook_QNAME = new QName("http://endpoint/", "purchaseBook");
    private final static QName _GetStores_QNAME = new QName("http://endpoint/", "getStores");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HashMapWrapper }
     * 
     */
    public HashMapWrapper createHashMapWrapper() {
        return new HashMapWrapper();
    }

    /**
     * Create an instance of {@link HashMapWrapper.BasketMap }
     * 
     */
    public HashMapWrapper.BasketMap createHashMapWrapperBasketMap() {
        return new HashMapWrapper.BasketMap();
    }

    /**
     * Create an instance of {@link GetStores }
     * 
     */
    public GetStores createGetStores() {
        return new GetStores();
    }

    /**
     * Create an instance of {@link PurchaseBook }
     * 
     */
    public PurchaseBook createPurchaseBook() {
        return new PurchaseBook();
    }

    /**
     * Create an instance of {@link GetBooksInLibrary }
     * 
     */
    public GetBooksInLibrary createGetBooksInLibrary() {
        return new GetBooksInLibrary();
    }

    /**
     * Create an instance of {@link GetPurchaseOrdersResponse }
     * 
     */
    public GetPurchaseOrdersResponse createGetPurchaseOrdersResponse() {
        return new GetPurchaseOrdersResponse();
    }

    /**
     * Create an instance of {@link Authorization }
     * 
     */
    public Authorization createAuthorization() {
        return new Authorization();
    }

    /**
     * Create an instance of {@link GetAllBooks }
     * 
     */
    public GetAllBooks createGetAllBooks() {
        return new GetAllBooks();
    }

    /**
     * Create an instance of {@link LockDebtorResponse }
     * 
     */
    public LockDebtorResponse createLockDebtorResponse() {
        return new LockDebtorResponse();
    }

    /**
     * Create an instance of {@link GetBookOperationsResponse }
     * 
     */
    public GetBookOperationsResponse createGetBookOperationsResponse() {
        return new GetBookOperationsResponse();
    }

    /**
     * Create an instance of {@link GetBookOperations }
     * 
     */
    public GetBookOperations createGetBookOperations() {
        return new GetBookOperations();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link GetUsersListResponse }
     * 
     */
    public GetUsersListResponse createGetUsersListResponse() {
        return new GetUsersListResponse();
    }

    /**
     * Create an instance of {@link GetUserOrdersResponse }
     * 
     */
    public GetUserOrdersResponse createGetUserOrdersResponse() {
        return new GetUserOrdersResponse();
    }

    /**
     * Create an instance of {@link GetUsersList }
     * 
     */
    public GetUsersList createGetUsersList() {
        return new GetUsersList();
    }

    /**
     * Create an instance of {@link GetBooksInLibraryResponse }
     * 
     */
    public GetBooksInLibraryResponse createGetBooksInLibraryResponse() {
        return new GetBooksInLibraryResponse();
    }

    /**
     * Create an instance of {@link UnlockDebtorResponse }
     * 
     */
    public UnlockDebtorResponse createUnlockDebtorResponse() {
        return new UnlockDebtorResponse();
    }

    /**
     * Create an instance of {@link AddNewStoreResponse }
     * 
     */
    public AddNewStoreResponse createAddNewStoreResponse() {
        return new AddNewStoreResponse();
    }

    /**
     * Create an instance of {@link AuthorizationResponse }
     * 
     */
    public AuthorizationResponse createAuthorizationResponse() {
        return new AuthorizationResponse();
    }

    /**
     * Create an instance of {@link UnlockDebtor }
     * 
     */
    public UnlockDebtor createUnlockDebtor() {
        return new UnlockDebtor();
    }

    /**
     * Create an instance of {@link FindDebtorsResponse }
     * 
     */
    public FindDebtorsResponse createFindDebtorsResponse() {
        return new FindDebtorsResponse();
    }

    /**
     * Create an instance of {@link PurchaseBookResponse }
     * 
     */
    public PurchaseBookResponse createPurchaseBookResponse() {
        return new PurchaseBookResponse();
    }

    /**
     * Create an instance of {@link GetPurchaseOrders }
     * 
     */
    public GetPurchaseOrders createGetPurchaseOrders() {
        return new GetPurchaseOrders();
    }

    /**
     * Create an instance of {@link AddNewBookResponse }
     * 
     */
    public AddNewBookResponse createAddNewBookResponse() {
        return new AddNewBookResponse();
    }

    /**
     * Create an instance of {@link GetStoresResponse }
     * 
     */
    public GetStoresResponse createGetStoresResponse() {
        return new GetStoresResponse();
    }

    /**
     * Create an instance of {@link GetUserOrders }
     * 
     */
    public GetUserOrders createGetUserOrders() {
        return new GetUserOrders();
    }

    /**
     * Create an instance of {@link AddNewBook }
     * 
     */
    public AddNewBook createAddNewBook() {
        return new AddNewBook();
    }

    /**
     * Create an instance of {@link Registration }
     * 
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link RegistrationResponse }
     * 
     */
    public RegistrationResponse createRegistrationResponse() {
        return new RegistrationResponse();
    }

    /**
     * Create an instance of {@link FindDebtors }
     * 
     */
    public FindDebtors createFindDebtors() {
        return new FindDebtors();
    }

    /**
     * Create an instance of {@link AddNewStore }
     * 
     */
    public AddNewStore createAddNewStore() {
        return new AddNewStore();
    }

    /**
     * Create an instance of {@link LockDebtor }
     * 
     */
    public LockDebtor createLockDebtor() {
        return new LockDebtor();
    }

    /**
     * Create an instance of {@link DatabaseObject }
     * 
     */
    public DatabaseObject createDatabaseObject() {
        return new DatabaseObject();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link UserOrder }
     * 
     */
    public UserOrder createUserOrder() {
        return new UserOrder();
    }

    /**
     * Create an instance of {@link Store }
     * 
     */
    public Store createStore() {
        return new Store();
    }

    /**
     * Create an instance of {@link AuthWrap }
     * 
     */
    public AuthWrap createAuthWrap() {
        return new AuthWrap();
    }

    /**
     * Create an instance of {@link PurchaseOrder }
     * 
     */
    public PurchaseOrder createPurchaseOrder() {
        return new PurchaseOrder();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link HashMapWrapper.BasketMap.Entry }
     * 
     */
    public HashMapWrapper.BasketMap.Entry createHashMapWrapperBasketMapEntry() {
        return new HashMapWrapper.BasketMap.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDebtors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "findDebtors")
    public JAXBElement<FindDebtors> createFindDebtors(FindDebtors value) {
        return new JAXBElement<FindDebtors>(_FindDebtors_QNAME, FindDebtors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "addNewStore")
    public JAXBElement<AddNewStore> createAddNewStore(AddNewStore value) {
        return new JAXBElement<AddNewStore>(_AddNewStore_QNAME, AddNewStore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockDebtor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "lockDebtor")
    public JAXBElement<LockDebtor> createLockDebtor(LockDebtor value) {
        return new JAXBElement<LockDebtor>(_LockDebtor_QNAME, LockDebtor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "addNewBook")
    public JAXBElement<AddNewBook> createAddNewBook(AddNewBook value) {
        return new JAXBElement<AddNewBook>(_AddNewBook_QNAME, AddNewBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "registrationResponse")
    public JAXBElement<RegistrationResponse> createRegistrationResponse(RegistrationResponse value) {
        return new JAXBElement<RegistrationResponse>(_RegistrationResponse_QNAME, RegistrationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "registration")
    public JAXBElement<Registration> createRegistration(Registration value) {
        return new JAXBElement<Registration>(_Registration_QNAME, Registration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getStoresResponse")
    public JAXBElement<GetStoresResponse> createGetStoresResponse(GetStoresResponse value) {
        return new JAXBElement<GetStoresResponse>(_GetStoresResponse_QNAME, GetStoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getUserOrders")
    public JAXBElement<GetUserOrders> createGetUserOrders(GetUserOrders value) {
        return new JAXBElement<GetUserOrders>(_GetUserOrders_QNAME, GetUserOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "addNewBookResponse")
    public JAXBElement<AddNewBookResponse> createAddNewBookResponse(AddNewBookResponse value) {
        return new JAXBElement<AddNewBookResponse>(_AddNewBookResponse_QNAME, AddNewBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "purchaseBookResponse")
    public JAXBElement<PurchaseBookResponse> createPurchaseBookResponse(PurchaseBookResponse value) {
        return new JAXBElement<PurchaseBookResponse>(_PurchaseBookResponse_QNAME, PurchaseBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPurchaseOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getPurchaseOrders")
    public JAXBElement<GetPurchaseOrders> createGetPurchaseOrders(GetPurchaseOrders value) {
        return new JAXBElement<GetPurchaseOrders>(_GetPurchaseOrders_QNAME, GetPurchaseOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewStoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "addNewStoreResponse")
    public JAXBElement<AddNewStoreResponse> createAddNewStoreResponse(AddNewStoreResponse value) {
        return new JAXBElement<AddNewStoreResponse>(_AddNewStoreResponse_QNAME, AddNewStoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "authorizationResponse")
    public JAXBElement<AuthorizationResponse> createAuthorizationResponse(AuthorizationResponse value) {
        return new JAXBElement<AuthorizationResponse>(_AuthorizationResponse_QNAME, AuthorizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlockDebtor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "unlockDebtor")
    public JAXBElement<UnlockDebtor> createUnlockDebtor(UnlockDebtor value) {
        return new JAXBElement<UnlockDebtor>(_UnlockDebtor_QNAME, UnlockDebtor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDebtorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "findDebtorsResponse")
    public JAXBElement<FindDebtorsResponse> createFindDebtorsResponse(FindDebtorsResponse value) {
        return new JAXBElement<FindDebtorsResponse>(_FindDebtorsResponse_QNAME, FindDebtorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlockDebtorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "unlockDebtorResponse")
    public JAXBElement<UnlockDebtorResponse> createUnlockDebtorResponse(UnlockDebtorResponse value) {
        return new JAXBElement<UnlockDebtorResponse>(_UnlockDebtorResponse_QNAME, UnlockDebtorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getUserOrdersResponse")
    public JAXBElement<GetUserOrdersResponse> createGetUserOrdersResponse(GetUserOrdersResponse value) {
        return new JAXBElement<GetUserOrdersResponse>(_GetUserOrdersResponse_QNAME, GetUserOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getUsersList")
    public JAXBElement<GetUsersList> createGetUsersList(GetUsersList value) {
        return new JAXBElement<GetUsersList>(_GetUsersList_QNAME, GetUsersList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksInLibraryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getBooksInLibraryResponse")
    public JAXBElement<GetBooksInLibraryResponse> createGetBooksInLibraryResponse(GetBooksInLibraryResponse value) {
        return new JAXBElement<GetBooksInLibraryResponse>(_GetBooksInLibraryResponse_QNAME, GetBooksInLibraryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getAllBooksResponse")
    public JAXBElement<GetAllBooksResponse> createGetAllBooksResponse(GetAllBooksResponse value) {
        return new JAXBElement<GetAllBooksResponse>(_GetAllBooksResponse_QNAME, GetAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getUsersListResponse")
    public JAXBElement<GetUsersListResponse> createGetUsersListResponse(GetUsersListResponse value) {
        return new JAXBElement<GetUsersListResponse>(_GetUsersListResponse_QNAME, GetUsersListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookOperationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getBookOperationsResponse")
    public JAXBElement<GetBookOperationsResponse> createGetBookOperationsResponse(GetBookOperationsResponse value) {
        return new JAXBElement<GetBookOperationsResponse>(_GetBookOperationsResponse_QNAME, GetBookOperationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookOperations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getBookOperations")
    public JAXBElement<GetBookOperations> createGetBookOperations(GetBookOperations value) {
        return new JAXBElement<GetBookOperations>(_GetBookOperations_QNAME, GetBookOperations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getAllBooks")
    public JAXBElement<GetAllBooks> createGetAllBooks(GetAllBooks value) {
        return new JAXBElement<GetAllBooks>(_GetAllBooks_QNAME, GetAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authorization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "authorization")
    public JAXBElement<Authorization> createAuthorization(Authorization value) {
        return new JAXBElement<Authorization>(_Authorization_QNAME, Authorization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockDebtorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "lockDebtorResponse")
    public JAXBElement<LockDebtorResponse> createLockDebtorResponse(LockDebtorResponse value) {
        return new JAXBElement<LockDebtorResponse>(_LockDebtorResponse_QNAME, LockDebtorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksInLibrary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getBooksInLibrary")
    public JAXBElement<GetBooksInLibrary> createGetBooksInLibrary(GetBooksInLibrary value) {
        return new JAXBElement<GetBooksInLibrary>(_GetBooksInLibrary_QNAME, GetBooksInLibrary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPurchaseOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getPurchaseOrdersResponse")
    public JAXBElement<GetPurchaseOrdersResponse> createGetPurchaseOrdersResponse(GetPurchaseOrdersResponse value) {
        return new JAXBElement<GetPurchaseOrdersResponse>(_GetPurchaseOrdersResponse_QNAME, GetPurchaseOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "purchaseBook")
    public JAXBElement<PurchaseBook> createPurchaseBook(PurchaseBook value) {
        return new JAXBElement<PurchaseBook>(_PurchaseBook_QNAME, PurchaseBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStores }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getStores")
    public JAXBElement<GetStores> createGetStores(GetStores value) {
        return new JAXBElement<GetStores>(_GetStores_QNAME, GetStores.class, null, value);
    }

}
