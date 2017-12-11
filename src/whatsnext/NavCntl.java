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
    private MergedProfile theMergedProfile = new MergedProfile();

    private static NavCntl theNavCntl = null;
    private static PersistentDataCntl theDataCntl;
    
    public NavCntl(){
        this.theDataCntl = PersistentDataCntl.getPersistentDataCntl();
        theListOfUsers = theDataCntl.getPeristentDataCollection().getTheUserList();
    }
    
    public NavCntl(Stage aStage){
        this.stage = aStage;
        setNavScene(stage);
        this.theDataCntl = PersistentDataCntl.getPersistentDataCntl();
        theListOfUsers = theDataCntl.getPeristentDataCollection().getTheUserList();
    }
    
    public static NavCntl getNavCntl(Stage aStage){
        if(theNavCntl == null){
            theNavCntl = new NavCntl(aStage);
        }
        
        return theNavCntl;
    }
    
    public void goToProfile(){
        ProfileCntl theProfileCntl = new ProfileCntl(this.stage);
    }
    
    public void goToHistory(){
        HistoryCntl theHistoryCntl = new HistoryCntl(this.stage);
    }
    
    public void goToRecommendation(){
        RecommendationCntl theRecCntl = new RecommendationCntl(this.stage);
    }
    
    public void goToMessages(){
        MessageCntl theMessageCntl = new MessageCntl(this.stage);
    }
    
    public void closeApp(){
        this.stage.close();
        PersistentDataCntl.getPersistentDataCntl().writeSerializedDataCollection();
        System.exit(0);
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

    /**
     * @return the theMergedProfile
     */
    public MergedProfile getTheMergedProfile() {
        return theMergedProfile;
    }

    /**
     * @param theMergedProfile the theMergedProfile to set
     */
    public void setTheMergedProfile(MergedProfile theMergedProfile) {
        this.theMergedProfile = theMergedProfile;
    }
}
