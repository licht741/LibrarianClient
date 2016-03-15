package types.AlertBuilders;


import javafx.scene.control.Alert;

public class AddNewStoreAlertBuilder {
    public static Alert getInvalidAdditionStoreAlert() {
        String title = "Ошибка добавления магазина";
        String content = "Возникла ошибка при добавлении магазина";

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        return alert;
    }
}
