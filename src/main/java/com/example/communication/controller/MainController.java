package com.example.communication.controller;

import com.example.communication.entity.Staff;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumnBase;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class MainController {
    @FXML
    private TableView<Staff> tableView;

    @FXML
    private TableColumn<Staff,String> name;
    @FXML
    private TableColumn<Staff,String> id;
    @FXML
    private TableColumn<Staff,String> department;
    @FXML
    private TableColumn<Staff,String> gender;
    @FXML
    private TableColumn<Staff,String> age;

    public void initialize(){
        List<Staff> staff = List.of();
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        age.setCellValueFactory(new PropertyValueFactory<>("age"));
        department.setCellValueFactory(new PropertyValueFactory<>("department"));
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableView.setItems(FXCollections.observableList(staff));
    }
}
