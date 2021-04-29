/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seniorclassregister.mainAdobe;

import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import seniorclassregister.controllersAdobe.Main_controller;
import seniorclassregister.controllersAdobe.class_register_model;

/**
 *
 * @author HP
 */
public class SeniorClassRegister extends Application {
    
    @Override
    public void start(Stage stage) throws IOException{
      Parent root = FXMLLoader.load(getClass().getResource("/seniorclassregister/fxmlAdobe/newFxml.fxml"));
              
        Scene scene = new Scene(root,490, 450);
        
        stage.setScene(scene);
        stage.setResizable(false);
        //stage.initModality(Modality.NONE);
        stage.setTitle("Class register");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
