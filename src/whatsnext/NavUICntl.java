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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Philz zee Kill
 */
public class NavUICntl implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button theProfileButton;
    
    @FXML
    private Button theHistoryButton;
    
    @FXML
    private Button theLogoutButton;
    
    @FXML
    private Button theRecommendationButton;
    
    private NavCntl theNavCntl = null;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    
    @FXML
    public void handleRecommendationButton(ActionEvent event){
        theNavCntl.goToRecommendation();
    }
    @FXML
    public void handleProfileButton(ActionEvent event){
        theNavCntl.goToProfile();
    }
    
    @FXML
    public void handleHistoryButton(ActionEvent event){
        theNavCntl.goToHistory();
    }
    
    @FXML
    public void handleCloseButton(ActionEvent event){
        theNavCntl.closeApp();
    }
    
    public void setNavCntl(NavCntl aNavCntl){
        this.theNavCntl = aNavCntl;
    }    
}
