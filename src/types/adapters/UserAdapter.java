package types.adapters;

import endpoint.User;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class UserAdapter {
    private int id;
    private final SimpleStringProperty login;
    private final SimpleStringProperty name;
    private final SimpleBooleanProperty access;

    public UserAdapter(User user) {
        this.id = user.getId();
        this.login = new SimpleStringProperty(user.getLogin());
        this.name = new SimpleStringProperty(user.getName());
        this.access = new SimpleBooleanProperty(user.isEnable());
    }

    public UserAdapter(int id, SimpleStringProperty login, SimpleStringProperty name, SimpleBooleanProperty access) {
        this.login = login;
        this.name = name;
        this.access = access;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login.get();
    }

    public SimpleStringProperty loginProperty() {
        return login;
    }

    public void setLogin(String login) {
        this.login.set(login);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public boolean getAccess() {
        return access.get();
    }

    public SimpleBooleanProperty accessProperty() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access.set(access);
    }
}
