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
import whatsnext.Recommendation.MediaType;

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
        
        System.out.println(theListOfUsers.getUserFromList(theCurrentUser).getProfile().getInbox().size());
        
    }
    
    public MessageCntl(){
        
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
    
    public Media checkMediaExists(String title, MediaType type){
        if(type == MediaType.FILM){
            return PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getTheMovieList().findMovie(title);
        } else {
            return PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getTheBookList().findBook(title);
        }
    }
    
    public boolean checkUserExists(String username){
        if(theListOfUsers.getUserFromList(username) != null){
            return true;
        }
        return false;
    }
    
    public void sendMessage(Message aMessage){
        
        String recipient = aMessage.getRecipient();
        String sender = aMessage.getSender();
        theListOfUsers.getUserFromList(recipient).getProfile().getInbox().add(aMessage);
        theListOfUsers.getUserFromList(sender).getProfile().getOutbox().add(aMessage);
        PersistentDataCntl.getPersistentDataCntl().writeSerializedDataCollection();
        System.out.println("Sent message!");
    }
    
       /**
     * @return the theCurrentUser
     */
    public String getTheCurrentUser() {
        return theCurrentUser;
    }

    /**
     * @param theCurrentUser the theCurrentUser to set
     */
    public void setTheCurrentUser(String theCurrentUser) {
        this.theCurrentUser = theCurrentUser;
    }
    
    
}
