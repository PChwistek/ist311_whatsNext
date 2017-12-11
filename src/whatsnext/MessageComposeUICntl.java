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
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Philz zee Kill
 */
public class MessageComposeUICntl implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ToggleGroup radioButtons;
    
    @FXML
    private RadioButton film;
    
    @FXML
    private RadioButton book;
    
    private MessageUICntl theMessageUICntl;
    
    private Button cancelButton;
    
    public MessageComposeUICntl(){
        radioButtons = new ToggleGroup();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        film.setToggleGroup(radioButtons);
        book.setToggleGroup(radioButtons);
    }    
    
    public void setTheMessageUICntl(MessageUICntl aMessageUICntl){
        this.theMessageUICntl = aMessageUICntl;
    }
    
    @FXML
    public void handleCancelButton(){
        theMessageUICntl.closeCompose();
    }
}
