package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private Label text;
    @FXML
    private TextField textField;
    @FXML
    private TextField textField1;

    public void sayHi (ActionEvent event){
        text.setText((textField.getText()) + " "+ textField1.getText() );
    }
}
