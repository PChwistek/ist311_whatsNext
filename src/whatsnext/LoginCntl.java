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
    
    
    public LoginCntl(Stage aStage){
        theListOfUsers = new UserList();
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
            NavCntl theNavCntl = new NavCntl(stage);
            return true;
        }             
        
        return false;
    }
    
    public boolean createNewUser(String username, String password){
        User userToCreate = new User(username, password);
        boolean success = theListOfUsers.addUserTolist(userToCreate);
        return success;
    }
    
}
