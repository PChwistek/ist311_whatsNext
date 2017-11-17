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
    private Button backToNavButton;
    @FXML
    private Label media1;
    @FXML
    private Label media2;
    @FXML
    private Label media3;
    @FXML
    private Label media4;
    @FXML
    private Label media5;
    @FXML
    private Label media6;
    @FXML
    private Label media7;
    @FXML
    private Label media8;
    @FXML
    private Label media9;
    @FXML
    private Label media10;
    @FXML
    private Label media11;
    @FXML
    private Label media12;
    
    private HistoryCntl theHistoryCntl;
    private ProfileCntl theProfileCntl;
    private RecommendationCntl theRecCntl;
    private Profile theUserProfile;
    private ArrayList<Media> mediaViewedList;
    
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
    
    public void handleBackToNavButton(ActionEvent event)
    {
        theHistoryCntl.goToNav();
    }
}
