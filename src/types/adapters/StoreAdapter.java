package types.adapters;


import endpoint.Store;
import javafx.beans.property.SimpleStringProperty;

public class StoreAdapter {
    private int id;
    private SimpleStringProperty name;
    private SimpleStringProperty phone;
    private SimpleStringProperty address;

    public StoreAdapter(Store store) {
        this.id = store.getId();
        this.name = new SimpleStringProperty(store.getName().trim());
        this.phone = new SimpleStringProperty(store.getPhone().trim());
        this.address = new SimpleStringProperty(store.getAddress().trim());
    }

    public StoreAdapter(int id, String name, String phone, String address) {
        this.id = id;
        this.name = new SimpleStringProperty(name.trim());
        this.phone = new SimpleStringProperty(phone.trim());
        this.address = new SimpleStringProperty(address.trim());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name.get().trim();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name.trim());
    }

    public String getPhone() {
        return phone.get().trim();
    }

    public SimpleStringProperty phoneProperty() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone.set(phone.trim());
    }

    public String getAddress() {
        return address.get().trim();
    }

    public SimpleStringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address.trim());
    }
}
