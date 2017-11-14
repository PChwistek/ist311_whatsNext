package whatsnext;

/**
* @author Adriannosaurus
*/

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class HistoryCntl
{
    private HistoryUICntl theHistoryUICntl;
    private Stage stage;
    private String theCurrentUser;
    private UserList theListOfUsers;
    private NavCntl theNavCntl;
    
    public HistoryCntl(Stage aStage, String aCurrentUser, UserList aListOfUsers)
    {
        this.stage = aStage;
        this.theCurrentUser = aCurrentUser;
        this.theListOfUsers = aListOfUsers;
        setHistoryScene(stage);
    }
    
    public void goToNav()
    {
        NavCntl theNavCntl = new NavCntl(stage, theCurrentUser, theListOfUsers);
    }
    
    public void setHistoryScene(Stage stage)
    {
         try
         {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HistoryUI.fxml"));
            Parent login = loader.load();
            theHistoryUICntl = loader.getController();
            theHistoryUICntl.setProfileCntl(this);
            Scene scene = new Scene(login);
            stage.setScene(scene);
            stage.show();
        }
         catch (IOException e)
         {
            e.printStackTrace();
        }
        
    }
}
