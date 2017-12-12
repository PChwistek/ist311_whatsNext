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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import whatsnext.Recommendation.MediaType;

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
    
    @FXML
    private TextField recipientField;
    
    @FXML
    private TextField mediaField;
    
    @FXML
    private TextArea textBody;
    
    private MessageUICntl theMessageUICntl;
    
    private Button cancelButton;
    
    public MessageComposeUICntl(){
        radioButtons = new ToggleGroup();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        film.setToggleGroup(radioButtons);
        book.setToggleGroup(radioButtons);
        radioButtons.selectToggle(film);
    }    
    
    public void setTheMessageUICntl(MessageUICntl aMessageUICntl){
        this.theMessageUICntl = aMessageUICntl;
    }
    
    @FXML
    public void handleCancelButton(){
        theMessageUICntl.closeCompose();
    }
    
    @FXML
    public void handleSend(){
        
        Recommendation theRec = null;    
        Media toRec = null;
        
        if(!recipientField.getText().isEmpty() && !mediaField.getText().isEmpty() && radioButtons.getSelectedToggle() != null){
            
            if(radioButtons.getSelectedToggle() == film){
                toRec = requestCheckMediaExists(mediaField.getText(), MediaType.FILM);
                theRec = new Recommendation(toRec, 100, MediaType.FILM);
            } else {
                toRec = requestCheckMediaExists(mediaField.getText(), MediaType.BOOK);
                theRec = new Recommendation(toRec, 100, MediaType.BOOK);
            }
        }
        
        if(toRec != null && requestCheckUserExists()){
            Message theMessage = new Message(recipientField.getText(), theMessageUICntl.getTheMessageCntl().getTheCurrentUser(), textBody.getText(), theRec);
            theMessageUICntl.closeCompose();
            theMessageUICntl.getTheMessageCntl().sendMessage(theMessage);
            
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Incorrect information");
            alert.setHeaderText("Incorrect Media or Recipient");
            alert.setContentText("Please re-enter the recipient and media");
            alert.showAndWait();
        }
    }
   
    
    private Media requestCheckMediaExists(String title, MediaType type){
        return theMessageUICntl.getTheMessageCntl().checkMediaExists(title, type);
    }
    
    private boolean requestCheckUserExists(){
        return theMessageUICntl.getTheMessageCntl().checkUserExists(recipientField.getText());
    }
}
