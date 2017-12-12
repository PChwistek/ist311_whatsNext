/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Philz zee Kill
 */
public class MessageUICntl implements Initializable {

    @FXML
    private TableView<?> filterAttributeTable;
    @FXML
    private TableColumn<?, ?> attributeNameColumn;
    @FXML
    private TableColumn<?, ?> attributeSentimentColumn;
    @FXML
    private Button removeButton;
    
    private MessageCntl theMessageCntl;
    
    private Stage composeStage;
    
    private MessageComposeUICntl theMessageComposeUICntl;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void removeFromTable(ActionEvent event) {
        
    }
    
    @FXML
    private void handleComposeButton(ActionEvent event){
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MessageComposeUI.fxml"));
        composeStage = new Stage();
        try {
            Parent login = loader.load();
            theMessageComposeUICntl = loader.getController();
            theMessageComposeUICntl.setTheMessageUICntl(this);
            Scene scene = new Scene(login);
            composeStage.setScene(scene);
            composeStage.showAndWait();

        } catch (IOException ex) {
            // TODO: handle error
            return;
        }
    }
    
    public void closeCompose(){
        composeStage.close();
    }

    @FXML
    private void handleBackToNavButton(ActionEvent event) {
        theMessageCntl.goToNav();
    }
    
    public void setMessageCntl(MessageCntl aMessageCntl){
        this.theMessageCntl = aMessageCntl;
    }
    
    public MessageCntl getTheMessageCntl(){
        return this.theMessageCntl;
    }
    
}
