/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Philz zee Kill
 */
public class MessageUICntl implements Initializable {

    @FXML
    private TableView<?> filterAttributeTable;
    @FXML
    private TableColumn<?, ?> attributeNameColumn;
    @FXML
    private TableColumn<?, ?> attributeSentimentColumn;
    @FXML
    private Button removeButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void removeFromTable(ActionEvent event) {
    }

    @FXML
    private void handleBackToNavButton(ActionEvent event) {
    }
    
}
