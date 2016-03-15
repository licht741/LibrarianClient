package types.AlertBuilders;


import javafx.scene.control.Alert;

public class NewBookAdditionAlertBuilder {
    public static Alert getInvalidBookDataAlert() {
        String title = "Ошибка в исходных данных";
        String content = "Пожалуйста, проверьте входные данные. Все поля должны быть заполнены, " +
                "год должен быть целочисленным";
        Alert alert = new Alert(Alert.AlertType.WARNING);

        alert.setTitle(title);
        alert.setContentText(content);
        return alert;
    }
}
