/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seniorclassregister.controllersAdobe;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author HP
 */
public class Main_controller extends ListCell<class_register_model> implements Initializable {
    
    @FXML
    private TextField firstname_textField;

    @FXML
    private TextField lastname_textField;

    @FXML
    private TextField classname_textField;
    
    @FXML
    private GridPane grid_root;
    private class_register_model model;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        updateSelected(false);
        
        getGrid_root().getChildrenUnmodifiable().forEach(c -> {
            c.focusedProperty().addListener((obj, prev, curr) -> {
                if (!curr) {
                    commitEdit(model);
                }
            });
        });
        
        setGraphic(grid_root);
    }
        public GridPane getGrid_root() {
            return grid_root;
        }
        
        private static final Logger LOG = Logger.getLogger(Main_controller.class.getName());
            
            public static Main_controller newInstance() {
        FXMLLoader loader = new FXMLLoader(Main_controller.class.getResource("/seniorclassregister/fxmlAdobe/FXMLDocument.fxml"));
        try {
            loader.load();
            return loader.getController();
        } catch (IOException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return null;
        }
    }
        @Override
    protected void updateItem(class_register_model item, boolean empty) {
        super.updateItem(item, empty); // <-- Important
        // make empty cell items invisible
        getGrid_root().getChildrenUnmodifiable().forEach(new Consumer<Node>() {
            @Override
            public void accept(Node c) {
                c.setVisible(!empty);
            }
        });
        // update valid cells with model data
        if (!empty && item != null && !item.equals(this.model)) {
            firstname_textField.textProperty().set(item.firstName());
            lastname_textField.textProperty().set(item.lastName());
            classname_textField.textProperty().set(item.className());
        }
        // keep a reference to the model item in the ListCell
        this.model = item;
    }
    
    @Override
    public void updateSelected(boolean selected) {
        super.updateSelected(selected);
        // update UI hints based on selected state
        getGrid_root().getChildrenUnmodifiable().forEach(c -> {
            // setting mouse-transparent to false ensure that
            // the cell will get selected we click on a field in
            // a non-selected cell
            c.setMouseTransparent(!selected);
            // focus-traversable prevents users from "tabbing"
            // out of the currently selected cell
            c.setFocusTraversable(selected);
        });
        if (selected) {
            // start editing when the cell is selected
            startEdit();
        } else {
            if (model != null) {
                // commit edits if the cell becomes unselected
                // we're not keeping track of "dirty" state
                // so this will commit changes even to unmodified cells
                commitEdit(model);
            }
        }
    }
    }    
