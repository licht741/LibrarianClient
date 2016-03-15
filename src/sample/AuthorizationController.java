package sample;


import endpoint.AuthWrap;
import endpoint.ILibrarianService;
import endpoint.LibrarianServiceService;
import types.controllers.BookController;
import types.controllers.OperationController;


/*
 *
 * Класс, инкапсулирующий логику авторизации и регистрации читателей
 * Реализован паттерном Singleton
 *
 */

public class AuthorizationController {
    private static AuthorizationController instance;
    private static ILibrarianService port;

    boolean isAuthorization;

    String login;
    String name;
    boolean enabled;

    public static AuthorizationController getInstance() {
        if (instance == null)
            instance = new AuthorizationController();
        return instance;
    }

    private AuthorizationController() {
            isAuthorization = false;

            LibrarianServiceService service = new LibrarianServiceService();
            port = service.getLibrarianServicePort();
        }


    public int authorization(String login, String password) {
        AuthWrap authWrap = port.authorization(login, password);
        switch (authWrap.getResult()) {
            case -3:
            case -1:
                login = "";
                name = "";
                enabled = false;
                isAuthorization = false;
                break;
            case -2:
                isAuthorization = true;
                this.login = login;
                this.name = authWrap.getUserName();
                this.enabled = false;
                break;
            case 0:
                isAuthorization = true;
                this.login = login;
                this.name = authWrap.getUserName();
                this.enabled = true;

                //BookController.getInstance().setUserID(authWrap.getUserID());
                //OperationController.getInstance().setUserID(authWrap.getUserID());
        }
        return authWrap.getResult();
    }

    public int registration(String login, String password, String name) {
        if (login.isEmpty() || password.isEmpty() || name.isEmpty())
            return -2;
        return port.registration(login, password, name);
    }


    public boolean isAuthorization() {
        return isAuthorization;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
