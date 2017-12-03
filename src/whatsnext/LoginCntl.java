/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 *
 * @author Phil
 */
public class LoginCntl {
    
    private UserList theListOfUsers;
    private LoginUICntl theLoginUICntl;
    private CreateAccountUICntl theCreateAccountUICntl;
    private Stage stage;
    private String theCurrentUser;
    private PersistentDataCollection thePersistentDataCollection;
   
    
    public LoginCntl(Stage aStage){
        this.thePersistentDataCollection = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection();
        theListOfUsers = thePersistentDataCollection.getTheUserList();
        this.stage = aStage;
        setLoginScene(stage);
    }
    
    public void setLoginScene(Stage stage){
        
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginUI.fxml"));
            Parent login = loader.load();
            theLoginUICntl = loader.getController();
            theLoginUICntl.setLoginCntl(this);
            Scene scene = new Scene(login);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public void setCreateAccountScene(Stage stage){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateAccountUI.fxml"));
            Parent login = loader.load();
            theCreateAccountUICntl = loader.getController();
            theCreateAccountUICntl.setLoginCntl(this);
            Scene scene = new Scene(login);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public boolean authenticate(String aUsername, String aPassword){
        
        if(theListOfUsers.verifyLogin(aUsername, aPassword)){
            setTheCurrentUser(aUsername);
            NavCntl theNavCntl = NavCntl.getNavCntl(this.stage);
            theNavCntl.setTheCurrentUser(theCurrentUser); //this is temporary as we don't yet have a persistent data controller
            theNavCntl.setTheListOfUsers(theListOfUsers); // same as above
            return true;
        }             
        
        return false;
    }
    
    public void closeApp(){
        stage.close();
        PersistentDataCntl.getPersistentDataCntl().writeSerializedDataCollection();
        System.exit(0);
    }
    
    public boolean createNewUser(String username, String password){
        User userToCreate = new User(username, password);
        boolean success = theListOfUsers.addUserTolist(userToCreate);
        setTheCurrentUser(username);
        thePersistentDataCollection.setTheUserList(theListOfUsers);
        return success;
    }
    
    public String getTheCurrentUser(){
        return theCurrentUser;
    }
    
    public void setTheCurrentUser(String aUsername){
        this.theCurrentUser = aUsername;
    }
    
}
