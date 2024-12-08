package com.example.communication.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class StaffAddController {
    @FXML
    private TextField id;

    @FXML
    private TextField name;
    @FXML
    private TextField aga;
    @FXML
    private ChoiceBox<String> gender;
    @FXML
    private TextField department;

    public void initialize(){
        gender.getItems().clear();
        gender.getItems().addAll("男","女");
    }
}
