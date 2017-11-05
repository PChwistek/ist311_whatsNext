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
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Philz zee Kill
 */
public class CreateAccountUICntl implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button submitButton;
    
    @FXML
    private Button cancelButton;
    
    @FXML
    private TextField theUsernameField;
    
    @FXML
    private TextField confirmUsernameField;
    
    @FXML
    private PasswordField thePasswordField;
    
    @FXML
    private PasswordField confirmPasswordField;
    
    private LoginCntl theLoginCntl;
    
    
    @FXML
    private void handleSubmitButton(ActionEvent event) throws Exception {
        
        String username = theUsernameField.getText();
        String password = thePasswordField.getText();
        String username2 = confirmUsernameField.getText();
        String password2 = confirmPasswordField.getText();
        
        boolean fieldsMatch = username.equals(username2) && password.equals(password2);
        boolean usernameUnique = false;
        //Display nav page only if login is successful
        if (fieldsMatch)
        {
            usernameUnique = theLoginCntl.createNewUser(username, password);
        } 
        
        if(fieldsMatch && usernameUnique){
            theLoginCntl.setLoginScene((Stage) cancelButton.getScene().getWindow());
        } else {
            theUsernameField.clear();
            thePasswordField.clear();
            confirmUsernameField.clear();
            confirmPasswordField.clear();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Incorrect field entries");
            alert.setHeaderText("Username or Password do not match or username already exists");
            alert.setContentText("Please enter new credentials");
            alert.showAndWait();
        }
        
    }
    
    @FXML
    private void handleCancelButton(ActionEvent event) throws Exception {
        theLoginCntl.setLoginScene((Stage) cancelButton.getScene().getWindow());
    }
    
    public void setLoginCntl(LoginCntl aLoginCntl){
        this.theLoginCntl = aLoginCntl;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
