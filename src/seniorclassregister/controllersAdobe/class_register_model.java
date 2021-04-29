/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seniorclassregister.controllersAdobe;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author HP
 */
public class class_register_model {
    //******************************data properties******************
    private final StringProperty firstNameProperty = new SimpleStringProperty();
    private final StringProperty lastNameProperty = new SimpleStringProperty();
    private final StringProperty classNameProperty = new SimpleStringProperty();
    //*******************************************************************
    
    public class_register_model(){
    }
    
    public StringProperty firstNameProperty() {
        return firstNameProperty;
    }
    public String firstName() {
        return firstNameProperty().get();
    }public class_register_model firstName(String fname) {
        firstNameProperty().set(fname);
        return this;
    }
    
    public StringProperty lastNameProperty() {
        return lastNameProperty;
    }
    public String lastName() {
        return lastNameProperty().get();
    }public class_register_model lastName(String lname) {
        lastNameProperty().set(lname);
        return this;
    }
    
    public StringProperty classNameProperty() {
        return classNameProperty;
    }
    public String className() {
        return classNameProperty().get();
    }public class_register_model className(String cname) {
        classNameProperty().set(cname);
        return this;
    }
}
