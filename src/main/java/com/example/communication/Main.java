package com.example.communication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        Main.stage=stage;
        stage.setTitle("管理系统!");
        changeView("Login.fxml");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void changeView(String fxml){
        Parent root=null;
        try{
            root=FXMLLoader.load(Main.class.getResource(fxml));
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}