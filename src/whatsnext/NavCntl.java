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
    private static NavCntl theNavCntl = null;
    
    private NavCntl(Stage aStage){
        this.stage = aStage;
        setNavScene(stage);
    }
    
    public static NavCntl getNavCntl(Stage aStage){
        if(theNavCntl == null){
            theNavCntl = new NavCntl(aStage);
        }
        
        return theNavCntl;
    }
    
    public void goToProfile(){
        ProfileCntl theProfileCntl = new ProfileCntl(stage);
    }
    
    public void goToHistory(){
        HistoryCntl theHistoryCntl = new HistoryCntl(stage);
    }
    
    public void setNavScene(Stage stage){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NavUI.fxml"));
            Parent theNavUI = loader.load();
            theNavUICntl = loader.getController();
            stage.hide();
            Scene scene = new Scene(theNavUI);
            stage.setScene(scene);
            stage.show();
            System.out.println("here");
        } catch (IOException e){
            e.printStackTrace();
        }
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

    /**
     * @return the theListOfUsers
     */
    public UserList getTheListOfUsers() {
        return theListOfUsers;
    }

    /**
     * @param theListOfUsers the theListOfUsers to set
     */
    public void setTheListOfUsers(UserList theListOfUsers) {
        this.theListOfUsers = theListOfUsers;
    }
}
