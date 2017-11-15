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
    private NavCntl theNavCntl = null;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void handleProfileButton(ActionEvent event){
        theNavCntl = NavCntl.getNavCntl((Stage) theProfileButton.getScene().getWindow());
        theNavCntl.goToProfile();
    }
    
    public void handleHistoryButton(ActionEvent event){
        theNavCntl = NavCntl.getNavCntl((Stage) theHistoryButton.getScene().getWindow());
        theNavCntl.goToHistory();
    }
    
    public void setNavCntl(Stage aStage){
    }
    
    
    
}
