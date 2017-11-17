package whatsnext;

/**
* @author Adriannosaurus
*/

import java.io.IOException;
import java.util.ArrayList;
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
    private NavCntl theNavCntl;
    private ArrayList<Media> mediaViewedList;
    
    public HistoryCntl(Stage aStage)
    {
        this.stage = aStage;
        theNavCntl = NavCntl.getNavCntl(aStage);
        this.mediaViewedList = theNavCntl.getTheListOfUsers().getUserFromList(theNavCntl.getTheCurrentUser()).getProfile().getHistory();
        setHistoryScene(stage);
        System.out.println(mediaViewedList.size());
    }
    
    public void goToNav()
    {
        theNavCntl.setNavScene(this.stage);
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

    /**
     * @return the mediaViewedList
     */
    public ArrayList<Media> getMediaViewedList() {
        return mediaViewedList;
    }

    /**
     * @param mediaViewedList the mediaViewedList to set
     */
    public void setMediaViewedList(ArrayList<Media> mediaViewedList) {
        this.mediaViewedList = mediaViewedList;
    }
}
