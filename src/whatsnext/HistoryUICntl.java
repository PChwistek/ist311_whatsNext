package whatsnext;

/**
* @author Adriannosaurus
*/

import java.net.URL;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HistoryUICntl implements Initializable
{
    @FXML
    private Button backToNavButton;
    
     @FXML
    private TableView<Media> historyTable = new TableView();
    
    @FXML
    private TableColumn<Media, String> mediaTitleColumn = new TableColumn("Title");
    
    @FXML
    private TableColumn<Media, String> mediaDateViewedColumn = new TableColumn("Date Viewed");
    
    @FXML
    private ObservableList<Media> listOfViewedMedia = FXCollections.observableArrayList();
    
    private HistoryCntl theHistoryCntl;
    private Profile theUserProfile;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
        mediaTitleColumn.setCellValueFactory(new PropertyValueFactory<Media,String>("title"));
        mediaDateViewedColumn.setCellValueFactory(new PropertyValueFactory<Media,String>("dateViewed"));
        historyTable.setItems(listOfViewedMedia);

    }
    
    public void setProfileCntl(HistoryCntl aHistoryCntl)
    {
        this.theHistoryCntl = aHistoryCntl;
        listOfViewedMedia = FXCollections.observableArrayList(theHistoryCntl.getMediaViewedList());
        historyTable.setItems(listOfViewedMedia);
    }
    
    public void handleBackToNavButton(ActionEvent event)
    {
        theHistoryCntl.goToNav();
    }
}
