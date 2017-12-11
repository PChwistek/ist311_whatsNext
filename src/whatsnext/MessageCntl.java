/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Philz zee Kill
 */
public class MessageCntl {
    
    private MessageUICntl theMessageUICntl;
    private Stage stage;
    private NavCntl theNavCntl;
    private UserList theListOfUsers;
    private String theCurrentUser;
    private ArrayList<Message> inbox;
    private ArrayList<Message> outbox;
    private PersistentDataCntl theDataCntl;
    
    public MessageCntl(Stage aStage){
        
        this.stage = aStage;
        this.theNavCntl = NavCntl.getNavCntl(aStage);
        this.theCurrentUser = theNavCntl.getTheCurrentUser(); //already got from ser in Nav cntl
        this.theListOfUsers = theNavCntl.getTheListOfUsers();
        this.inbox = theNavCntl.getTheListOfUsers().getUserFromList(theCurrentUser).getProfile().getInbox();
        this.outbox = theNavCntl.getTheListOfUsers().getUserFromList(theCurrentUser).getProfile().getOutbox();
        setMessageUI(this.stage);
        
    }
    
    public void setMessageUI(Stage aStage){
        
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MessageUI.fxml"));
            Parent login = loader.load();
            theMessageUICntl = loader.getController();
            theMessageUICntl.setMessageCntl(this);
            Scene scene = new Scene(login);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
    public void goToNav(){
        this.theNavCntl.setNavScene(stage);
        PersistentDataCntl.getPersistentDataCntl().writeSerializedDataCollection();
    }
    
    
}
