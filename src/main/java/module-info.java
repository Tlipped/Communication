module com.example.communication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.communication to javafx.fxml;
    exports com.example.communication;
}