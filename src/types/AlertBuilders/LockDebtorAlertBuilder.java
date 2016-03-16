package types.AlertBuilders;

import javafx.scene.control.Alert;

public class LockDebtorAlertBuilder {
    public static Alert getUserIsNotSelectedAlert() {
        String title = "Не выбран пользователь";
        String content = "Пожалуйста, выберите пользователя из списка";
        Alert alert = new Alert(Alert.AlertType.WARNING);

        alert.setTitle(title);
        alert.setContentText(content);
        return alert;
    }

    public static Alert getUserIsNotDebtorAlert() {
        String title = "Пользователь выбран ошибочно";
        String content = "У указанного пользователя отсутствуют задолженности";
        Alert alert = new Alert(Alert.AlertType.WARNING);

        alert.setTitle(title);
        alert.setContentText(content);
        return alert;
    }
}
