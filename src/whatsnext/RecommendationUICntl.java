/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Philz zee Kill
 */
public class RecommendationUICntl implements Initializable {

    @FXML
    private TextField searchField;
    
    @FXML
    private CheckBox incognitoChkBox;
    
    @FXML
    private TableView<?> attributeTable;
    
    @FXML
    private TableColumn<?, ?> attributeColumn;
    
    @FXML
    private TableColumn<?, ?> relevanceColumn;
    
    @FXML
    private CheckBox posFilterChkBox;
    
    @FXML
    private CheckBox negFilterChkBox;
    
    @FXML
    private TableView<?> resultsTable;
    
    @FXML
    private TableColumn<?, ?> searchResultsColumn;
    
    @FXML
    private Button cancelButton;
    
    private RecommendationCntl theRecCntl = null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setRecommendationCntl(RecommendationCntl aRecCntl){
        theRecCntl = aRecCntl;
    }
    
}
