/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Philz zee Kill
 */
public class NavUICntl implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    private NavCntl theNavCntl;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setNavCntl(NavCntl aNavCntl){
        this.theNavCntl = aNavCntl;
    }
    
    
    
}
