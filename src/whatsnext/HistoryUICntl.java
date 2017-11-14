package whatsnext;

/**
* @author Adriannosaurus
*/

import java.net.URL;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HistoryUICntl implements Initializable
{
    @FXML
    private Button cancelButton;
    
    private HistoryCntl theHistoryCntl;
    private ProfileCntl theProfileCntl;
    private Profile theUserProfile;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }
    
    public void setProfileCntl(HistoryCntl aHistoryCntl)
    {
        this.theHistoryCntl = aHistoryCntl;
        System.out.println("ProfileCntl in histUICntl set");
    }
    
    public void handleCancelButton(ActionEvent event)
    {
        theHistoryCntl.goToNav();
    }
}
