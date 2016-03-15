package types.AlertBuilders;

import javafx.scene.control.Alert;

public class AlertRegistrationDialogBuilder {
    public static Alert getExistingLoginErrorAlert() {
        String title = "Ошибка регистрации";
        String content = "Пользователь с указанным логином уже существует";

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        return alert;
    }

    public static Alert getInvalidInputDataErrorAlert() {
        String title = "Ошибка регистрации";
        String content = "Возможно, введены не все регистрационные данные";

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        return alert;
    }

    public static Alert getSystemErrorAlert() {
        String title = "Ошибка регистрации";
        String content = "Возникла ошибка при обращении к серверу или базе данных";

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        return alert;
    }

}