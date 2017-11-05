package whatsnext;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Phil
 */
public class LoginUICntl implements Initializable {
    
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
    private Text createAccount;
    
    private LoginCntl theLoginCntl;
    
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
         
        //Display nav page only if login is successful
        if (!theLoginCntl.authenticate(username, password))
        {
            theUsernameField.clear();
            thePasswordField.clear();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Incorrect credentials");
            alert.setHeaderText("Incorrect Username or Password");
            alert.setContentText("Please re-enter your username and password");
            alert.showAndWait();
        }
    }
    
    @FXML
    private void handleCreateAccount(){
        theLoginCntl.setCreateAccountScene((Stage)cancelButton.getScene().getWindow());
    }
    
    public void setLoginCntl(LoginCntl aLoginCntl){
        this.theLoginCntl = aLoginCntl;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // things to do when started
    }    
    
}
