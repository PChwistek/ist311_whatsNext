/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Phil
 */
public class NavCntl {
    
    
    private Stage stage;
    private NavUICntl theNavUICntl;
    private String theCurrentUser;
    private UserList theListOfUsers;
    
    public NavCntl(Stage aStage, String aCurrentUser, UserList aListOfUsers){
        this.stage = aStage;
        setNavScene(stage);
        this.theCurrentUser = aCurrentUser;
        this.theListOfUsers = aListOfUsers;
    }
    
    public void goToProfile(){
        ProfileCntl theProfileCntl = new ProfileCntl(stage, theCurrentUser, theListOfUsers);
    }
    
    public void setNavScene(Stage stage){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NavUI.fxml"));
            Parent theNavUI = loader.load();
            theNavUICntl = loader.getController();
            theNavUICntl.setNavCntl(this);
            stage.hide();
            Scene scene = new Scene(theNavUI);
            stage.setScene(scene);
            stage.show();
            System.out.println("here");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
