package types.AlertBuilders;


import javafx.scene.control.Alert;

public class MakeOrderAlertBuilder {
    public static Alert getBookIsNotSelectedAlert() {
        String title = "Не выбрана книга";
        String content = "Пожалуйста, выберите заказываемую книгу из списка";
        Alert alert = new Alert(Alert.AlertType.WARNING);

        alert.setTitle(title);
        alert.setContentText(content);
        return alert;
    }

    public static Alert getShopIsNotSelectedAlert() {
        String title = "Не выбран магазин";
        String content = "Пожалуйста, выберите магазин из списка";
        Alert alert = new Alert(Alert.AlertType.WARNING);

        alert.setTitle(title);
        alert.setContentText(content);
        return alert;
    }

    public static Alert getInvalidBookCountAlert() {
        String title = "Ошибка в исходных данных";
        String content = "Число заказываемых книг должно быть не пусто и положительно";
        Alert alert = new Alert(Alert.AlertType.WARNING);

        alert.setTitle(title);
        alert.setContentText(content);
        return alert;
    }


}
