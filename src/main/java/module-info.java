module com.example.communication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.communication to javafx.fxml;
    exports com.example.communication;
    exports com.example.communication.controller;
    opens com.example.communication.controller to javafx.fxml;
    exports com.example.communication.util;
    opens com.example.communication.util to javafx.fxml;
}