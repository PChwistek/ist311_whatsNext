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
public class ProfileCntl {
    
    private ProfileUICntl theProfileUICntl;
    private Stage stage;
    
    public ProfileCntl(Stage aStage){
        this.stage = aStage;
        setProfileScene(stage);
    }
    
    public void setProfileScene(Stage stage){
        
         try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfileUI.fxml"));
            Parent login = loader.load();
            theProfileUICntl = loader.getController();
            theProfileUICntl.setProfileCntl(this);
            Scene scene = new Scene(login);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
}
