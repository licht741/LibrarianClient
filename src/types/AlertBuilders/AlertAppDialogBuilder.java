package types.AlertBuilders;


import javafx.scene.control.Alert;

public class AlertAppDialogBuilder {
    public static Alert getConnectionErrorAlert() {
        String title = "Проблемы с соединением";
        String content = "Возникла проблема с соединением. Не удаётся подключиться к серверу";
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);

        return alert;
    }
}
