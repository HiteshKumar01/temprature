module temp.temprature {
    requires javafx.controls;
    requires javafx.fxml;


    opens temp.temprature to javafx.fxml;
    exports temp.temprature;
}