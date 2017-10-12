/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Phil
 */
public class LoginCntl implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField theUsernameField;
    
    @FXML
    private PasswordField thePasswordField;
    
    @FXML 
    private Button cancelButton;
    
    @FXML
    private Button submitButton;
    
    @FXML
    private void handleCancelButton(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow(); //to make the exit seem nicer
        stage.close();
        System.exit(0);
    }
    
    @FXML
    private void handleSubmitButton(ActionEvent event) throws Exception {
        
        String username = theUsernameField.getText();
        String password = thePasswordField.getText();
        
        /* do the verification stuff here */
        
        
        
        Parent theNavUI = FXMLLoader.load(getClass().getResource("NavUI.fxml"));
        Stage stage = (Stage) cancelButton.getScene().getWindow(); //to make the exit seem nicer
        stage.hide();
        Scene scene = new Scene(theNavUI);
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // things to do when started
        theUsernameField.requestFocus();
    }    
    
}
