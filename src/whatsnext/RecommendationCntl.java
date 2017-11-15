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
 * @author Philz zee Kill
 */
public class RecommendationCntl {
    
    
    private RecommendationUICntl theRecUICntl;
    private Stage stage;
    private String theCurrentUser;
    private UserList theListOfUsers;
    private NavCntl theNavCntl = null;
    
    public RecommendationCntl(Stage aStage){
        this.stage = aStage;
        theNavCntl = NavCntl.getNavCntl(aStage);
        this.theCurrentUser = theNavCntl.getTheCurrentUser();
        this.theListOfUsers = theNavCntl.getTheListOfUsers();
        setRecScene(stage);
    }
    
    public void goToNav(){
        this.theNavCntl.setNavScene(stage);
    }
    
    public void setRecScene(Stage stage){
        
         try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RecommendationUI.fxml"));
            Parent login = loader.load();
            theRecUICntl = loader.getController();
            theRecUICntl.setRecommendationCntl(this);
            Scene scene = new Scene(login);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
    public Profile getCurrentUserProfile(){
        return theListOfUsers.getUserFromList(theCurrentUser).getProfile();
    }
    
    public void updateCurrentUserProfile(Profile profileToSet){
        theListOfUsers.getUserFromList(theCurrentUser).setProfile(profileToSet);
    }
    
    
}
