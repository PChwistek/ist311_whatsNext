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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Philz zee Kill
 */
public class ProfileUICntl implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField firstName;
    
    @FXML
    private TextField lastName;
    
    @FXML
    private TextField email;
    
    @FXML
    private TextField mergeUsername;
    
    @FXML
    private PasswordField mergePass;
    
    @FXML
    private Button cancelButton;
    
    @FXML
    private Button mergeButton;
    
    @FXML
    private Label mergedLabel;
    
    private ProfileCntl theProfileCntl;
    
    private Profile theUserProfile;
   
    
    public void setProfileCntl(ProfileCntl aProfileCntl){
        this.theProfileCntl = aProfileCntl;
        this.theUserProfile = theProfileCntl.getCurrentUserProfile();
        
        firstName.setText(theUserProfile.getFirstName());
        lastName.setText(theUserProfile.getLastName());
        email.setText(theUserProfile.getEmail());
        mergeUsername.setText(theProfileCntl.getTheMergedProfile().getUsername());
        mergePass.setText(theProfileCntl.getTheMergedProfile().getPassword());
        
        if(!mergeUsername.getText().equals("")){
            mergedLabel.setVisible(true);
        }
    }
    
    @FXML
    public void handleSubmitButton(ActionEvent event){
        theUserProfile.setFirstName(firstName.getText());
        theUserProfile.setLastName(lastName.getText());
        theUserProfile.setEmail(email.getText());
        
        System.out.println(firstName.getText() + " " + lastName.getText() + ", " + email.getText());
        
    }
    
    @FXML
    public void handleCancelButton(ActionEvent event){
        theProfileCntl.goToNav();
    }
    
    @FXML
    public void handleMergeButton(ActionEvent event){
        
        String username = mergeUsername.getText();
        String password = mergePass.getText();
        
        if(theProfileCntl.loginMerge(username, password)){
            mergedLabel.setVisible(true);
            mergeButton.setDisable(true);
        }
     
    }
    
    @FXML
    public void checkIfCanMerge(){
        if(!mergeUsername.getText().isEmpty() && !mergePass.getText().isEmpty()){
            mergeButton.setDisable(false);
        } else {
            mergeButton.setDisable(true);
        }
        mergedLabel.setVisible(false);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    
    }    
    
}
