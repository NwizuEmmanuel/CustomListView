/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seniorclassregister.controllersAdobe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class NewFxmlController implements Initializable {

    
    @FXML
    private ListView<class_register_model> newListView;
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          newListView.setCellFactory((ListView<class_register_model> lv) -> Main_controller.newInstance());

        ObservableList<class_register_model> persons = FXCollections.observableArrayList();
        persons.add(new class_register_model()
                .firstName("Okoli")
                .lastName("Adachukwu")
                .className("sss3A"));
        persons.add(new class_register_model()
                .firstName("Ikeh")
                .lastName("Bobby")
                .className("sss3B"));

        newListView.setItems(persons);      
        // TODO
        
        
        
        newListView.setOrientation(Orientation.HORIZONTAL);
        
        
              newListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<class_register_model>() {

            @Override
            public void changed(ObservableValue<? extends class_register_model> observable, class_register_model oldValue, class_register_model newValue) {
                // Your action here
                System.out.println("first name "+newValue.firstName());
                   System.out.println("last name "+newValue.lastName());
               System.out.println("class name "+newValue.className());
               System.out.println("////////////////////////////////////");
             
//                idd = newValue.getID();
//                new SearchhController.SplashScreen().start();

            }
        });
        
        
    }    
    
}
