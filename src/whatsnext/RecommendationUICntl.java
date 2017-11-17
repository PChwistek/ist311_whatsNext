/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import whatsnext.Recommendation.MediaType;

/**
 * FXML Controller class
 *
 * @author Philz zee Kill
 */
public class RecommendationUICntl implements Initializable {

    
    @FXML
    private ComboBox sentimentComboBox;
    
    @FXML
    private Button searchButton;
    
    @FXML
    private Button removeButton;
    
    @FXML
    private Button nextButton;
    
    @FXML
    private Button previousButton;
    
    @FXML
    private TextField attributeField;
    
    @FXML
    private ToggleButton filmToggle;
    
    @FXML
    private ToggleButton bookToggle;
    
    @FXML
    private Label helpText;
    
    @FXML
    private Label recommendationIndex;
    
    @FXML
    private TableView<FilterAttribute> filterAttributeTable = new TableView();
    
    @FXML
    private TableColumn<FilterAttribute, String> attributeNameColumn = new TableColumn("Attribute");
    
    @FXML
    private TableColumn<FilterAttribute, String> attributeSentimentColumn = new TableColumn("Sentiment");
    
    @FXML
    private ObservableList<FilterAttribute> listOfFilterAttributes = FXCollections.observableArrayList();
    
    @FXML
    private ObservableList<String> dropDownOptions;
    
    @FXML
    private AnchorPane recommendationDetail;
  
    private RecommendationCntl theRecCntl = null;
    
    private ArrayList<Recommendation> recommendedItems;
    
    private boolean filmToggled;
    
    private int indexOfRecommendation = -1;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        dropDownOptions = FXCollections.observableArrayList("Positive", "Negative");
        sentimentComboBox.getItems().addAll(dropDownOptions);
        sentimentComboBox.setValue("Positive");
        helpText.setVisible(true);
        recommendationDetail.setVisible(false);
        searchButton.setDisable(true);
        filmToggled = true;
        
        attributeNameColumn.setCellValueFactory(new PropertyValueFactory<FilterAttribute,String>("name"));
        attributeSentimentColumn.setCellValueFactory(new PropertyValueFactory<FilterAttribute,String>("sentString"));
        
        filterAttributeTable.setItems(listOfFilterAttributes);

        attributeField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER && attributeField.getText().length() > 0) {
                handleAddToTable();
                attributeField.clear();
            }
        });
        
    }   
    
    @FXML
    public void handleToggle(){
        filmToggled = !filmToggled;
        filmToggle.setSelected(filmToggled);
        bookToggle.setSelected(!filmToggled);
    }
    
    @FXML
    public void handleSearchButton(ActionEvent event){
        recommendedItems = theRecCntl.makeRecommendations(filmToggled, listOfFilterAttributes);
        
        if(recommendedItems.size() > 0){
            helpText.setVisible(false);
            recommendationDetail.setVisible(true);
            indexOfRecommendation = 0;
        }
    }
    
    @FXML 
    public void removeFromTable(ActionEvent event){
        if(getSelectedRow() >= 0){
            filterAttributeTable.getItems().remove(getSelectedRow());
        }
        if(filterAttributeTable.getItems().size() <= 0){
            searchButton.setDisable(true);
            removeButton.setDisable(true);
        }
    }
    
    @FXML
    public void handleNext(ActionEvent event){
        if(indexOfRecommendation == recommendedItems.size() -1){
            indexOfRecommendation = 0;
        } else {
            indexOfRecommendation += 1;
        }
        fillMediaInformation(recommendedItems.get(indexOfRecommendation));
    }
    
    @FXML
    public void handlePrevious(ActionEvent event){
        if(indexOfRecommendation == 0){
            indexOfRecommendation = recommendedItems.size() - 1;
        } else {
            indexOfRecommendation -= 1;
        }
        
        fillMediaInformation(recommendedItems.get(indexOfRecommendation));
    }
    
    @FXML
    public void fillMediaInformation(Recommendation aRecommendation){
        
        recommendationIndex.setText((indexOfRecommendation + 1) + "/" + recommendedItems.size());
        
        if(aRecommendation.getType() == MediaType.FILM){
            Movie filmToShow = (Movie) aRecommendation.getMediaToRecommend();
            
        } else {
            Book bookToShow = (Book) aRecommendation.getMediaToRecommend();
            
        }
        
        
    }
    
    
    public void handleAddToTable(){
        
        FilterAttribute temp = null;
        
        if(sentimentComboBox.getValue() == "Positive"){
            temp = new FilterAttribute(attributeField.getText(), FilterAttribute.Sentiment.POSITIVE);
        } else {
            temp = new FilterAttribute(attributeField.getText(), FilterAttribute.Sentiment.NEGATIVE);
        }
        filterAttributeTable.getItems().add(temp);
        System.out.println(attributeField.getText());
        searchButton.setDisable(false);
        removeButton.setDisable(false);
    }
    
    @FXML
    public int getSelectedRow(){
        return filterAttributeTable.getSelectionModel().getSelectedIndex();
    } 
    
    public void setRecommendationCntl(RecommendationCntl aRecCntl){
        theRecCntl = aRecCntl;
    }
    
    
    
    
}
