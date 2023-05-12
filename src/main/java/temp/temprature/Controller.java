package temp.temprature;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class Controller {
    @FXML
    public Button convertButton;

    @FXML
    public Button convertButton1;
    @FXML
    public Button clearButton;
    @FXML
    public Button exitButton;
    @FXML
    public TextField celciusField;
    @FXML
    public TextField farenField;


    @FXML
    public void onClickClearButton(ActionEvent actionEvent) {
        celciusField.clear();
        farenField.clear();
        System.out.println("input field cleared.....");


    }

    @FXML
    public void onClickExitButton(ActionEvent actionEvent) {
        System.out.println("exit pressed!");
        Platform.exit();

    }

    public void onClickConvertButton1(ActionEvent actionEvent) {
        Window owner = null;
        Float result= Float.valueOf(celciusField.getText());
        Float finalResult=(result*9/5)+32;
        System.out.println("converting celcius to farenheit............");
        System.out.println(result + " degree Celcius in Farenheit is " + finalResult + " degree Farenheit!");

        showAlert(Alert.AlertType.INFORMATION, owner, "Conversion Successful!", result +
                " degree Celcius is  " + finalResult + " degree Farenheit");

    }

    public void onClickConvertButton2(ActionEvent actionEvent) {
        Window owner1 = null;
        Float result1= Float.valueOf(farenField.getText());
        Float finalResult1=(result1-32) * 5/9;
        System.out.println(finalResult1);
        System.out.println("converting farenheit to celcius............");
        System.out.println(result1 + " degree Farenheit in Celcius is  " + finalResult1 + " degree Celcius!");

        showAlert(Alert.AlertType.INFORMATION, owner1,"Conversion Successfull!", result1 +
                " degree Ferenheit is  "+ finalResult1 + " degree celcius");

    }
    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);

        alert.show();
    }

}