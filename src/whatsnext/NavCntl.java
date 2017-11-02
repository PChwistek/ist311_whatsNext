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
    
    public NavCntl(Stage aStage){
        this.stage = aStage;
        setNavScene(stage);
    }
    
    public void setNavScene(Stage stage){
        try{
            Parent theNavUI = FXMLLoader.load(getClass().getResource("NavUI.fxml"));
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
