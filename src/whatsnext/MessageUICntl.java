/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Philz zee Kill
 */
public class MessageUICntl implements Initializable {
    
    
    @FXML
    private TableView<Message> messagesTable;
    
    @FXML
    private TableColumn<Message, String> messageSenderColumn;
    
    @FXML
    private TableColumn<Message, String> mediaTitleColumn;
    
    @FXML
    private TableColumn<Message, String> messageBodyColumn;
    
    @FXML
    private ObservableList<Message> inboxMessages = FXCollections.observableArrayList();
    
    @FXML
    private ObservableList<Message> outboxMessages = FXCollections.observableArrayList();
    
    @FXML
    private Button removeButton;
    
    @FXML
    private Label box;
    
    private MessageCntl theMessageCntl;
    
    private Stage composeStage;
    
    private MessageComposeUICntl theMessageComposeUICntl;
    
    private boolean inbox = true;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        box.setText("Inbox");
        messageSenderColumn.setCellValueFactory(new PropertyValueFactory<Message,String>("sender"));
        mediaTitleColumn.setCellValueFactory(new PropertyValueFactory<Message,String>("mediaTitle"));
        messageBodyColumn.setCellValueFactory(new PropertyValueFactory<Message,String>("bodyText"));
        
        messagesTable.setItems(inboxMessages);
        
        if(inboxMessages.size() > 0){
            removeButton.setDisable(false);
        } else {
            removeButton.setDisable(true);
        }
    }    

    @FXML
    private void removeFromTable(ActionEvent event) {
        
        if(getSelectedRow() >= 0){
            System.out.print(getSelectedRow());
            if(inbox){
                this.theMessageCntl.getInbox().remove(getSelectedRow());
            } else {
                this.theMessageCntl.getOutbox().remove(getSelectedRow());
            }
            messagesTable.getItems().remove(getSelectedRow());
        }
        
        if(messagesTable.getItems().size() <= 0){
            removeButton.setDisable(true);
        }
    }
    
    @FXML
    private void handleComposeButton(ActionEvent event){
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MessageComposeUI.fxml"));
        composeStage = new Stage();
        try {
            Parent login = loader.load();
            theMessageComposeUICntl = loader.getController();
            theMessageComposeUICntl.setTheMessageUICntl(this);
            Scene scene = new Scene(login);
            composeStage.setScene(scene);
            composeStage.showAndWait();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void closeCompose(){
        composeStage.close();
    }

    @FXML
    private void handleBackToNavButton(ActionEvent event) {
        theMessageCntl.goToNav();
    }
    
    public void setMessageCntl(MessageCntl aMessageCntl){
        this.theMessageCntl = aMessageCntl;
        this.inboxMessages = FXCollections.observableArrayList(this.theMessageCntl.getInbox());
        messagesTable.setItems(inboxMessages);
        messagesTable.refresh();
        
    }
    
    public MessageCntl getTheMessageCntl(){
        return this.theMessageCntl;
    }
    
    @FXML
    public void handleInbox(){
        inbox = true;
        box.setText("Inbox");
        messageSenderColumn.setText("Sender");
        messageSenderColumn.setCellValueFactory(new PropertyValueFactory<Message,String>("sender"));
        this.inboxMessages = FXCollections.observableArrayList(this.theMessageCntl.getInbox());
        messagesTable.setItems(inboxMessages);
        messagesTable.refresh();
        
        if(inboxMessages.size() > 0){
            removeButton.setDisable(false);
            messagesTable.getSelectionModel().selectFirst();
        } else {
            removeButton.setDisable(true);
        }
    }
    
    @FXML
    public void handleOutbox(){
        inbox = false;
        box.setText("Outbox");
        messageSenderColumn.setText("Recipient");
        messageSenderColumn.setCellValueFactory(new PropertyValueFactory<Message,String>("recipient"));
        this.outboxMessages = FXCollections.observableArrayList(this.theMessageCntl.getOutbox());
        messagesTable.setItems(outboxMessages);
        messagesTable.refresh();
        if(inboxMessages.size() > 0){
            removeButton.setDisable(false);
            messagesTable.getSelectionModel().selectFirst();
        } else {
            removeButton.setDisable(true);
        }
    }
    
    @FXML
    public int getSelectedRow(){
        return messagesTable.getSelectionModel().getSelectedIndex();
    } 
    
}
