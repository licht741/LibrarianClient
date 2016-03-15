package types.AlertBuilders;

import javafx.scene.control.Alert;

public class AlertAuthorizationDialogBuilder {
    public static Alert getSystemErrorAlert() {
        String title = "Системная ошибка";
        String content = "Произошла ошибка при обращении к серверу или базе данных";

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        return alert;
    }

    public static Alert getUserDisabledAlert() {
        String title = "Вход выполнен успешно";
        String content = "Вы заблокированы в системе и не можете брать и заказывать книги";

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setContentText(content);
        return alert;
    }

    public static Alert getAuthErrorAlert() {
        String title = "Не удалось войти в систему";
        String content = "Проверьте правильность введенных данных";

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setContentText(content);
        return alert;
    }

    public static Alert getAuthSuccessAlert() {
        String title = "Вход выполнен успешно";

        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle(title);
        return alert;
    }

}