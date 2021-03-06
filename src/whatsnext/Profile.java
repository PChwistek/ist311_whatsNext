package whatsnext;

import java.io.Serializable;
import java.util.ArrayList;

public class Profile implements Serializable{
   
    private ArrayList<Filterable> preferences = new ArrayList();
    private ArrayList<Media> history = new ArrayList();
    private ArrayList<Message> inbox = new ArrayList();
    private ArrayList<Message> outbox = new ArrayList();
    
    private String firstName;
    private String lastName;
    private String email;
    
    public Profile(){
        firstName = "";
        lastName = "";
        email = "";
    }
    
    public Profile(String fn, String ln, String e){
        this.preferences = savePreferences();
        this.firstName = fn;
        this.lastName = ln;
        this.email = e;
    }
    
    //saves preferences from genre, keyword, and MPAA rating attribute lists into profile
    public ArrayList<Filterable> savePreferences(){
        return null;
    }
    
    /**
     * @return the preferences
     */
    public ArrayList<Filterable> getPreferences() {
        return preferences;
    }

    /**
     * @param preferences the preferences to set
     */
    public void setPreferences(ArrayList<Filterable> preferences) {
        this.preferences = preferences;
    }

 
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the history
     */
    public ArrayList<Media> getHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(ArrayList<Media> history) {
        this.history = history;
    }

    public ArrayList<Message> getInbox() {
        return inbox;
    }

    public void setInbox(ArrayList<Message> inbox) {
        this.inbox = inbox;
    }

    public ArrayList<Message> getOutbox() {
        return outbox;
    }

    public void setOutbox(ArrayList<Message> outbox) {
        this.outbox = outbox;
    }
}
