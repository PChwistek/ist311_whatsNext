/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    
    
    private ProfileCntl theProfileCntl;
    
    private Profile theUserProfile;
    
    
    
    public void setProfileCntl(ProfileCntl aProfileCntl){
        this.theProfileCntl = aProfileCntl;
        this.theUserProfile = theProfileCntl.getCurrentUserProfile();
        
        firstName.setText(theUserProfile.getFirstName());
        lastName.setText(theUserProfile.getLastName());
        email.setText(theUserProfile.getEmail());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
