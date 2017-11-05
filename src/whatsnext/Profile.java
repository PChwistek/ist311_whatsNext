package whatsnext;

import java.util.ArrayList;

public class Profile {
   
    private ArrayList<FilterAttribute> preferences = new ArrayList();
    
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
    public ArrayList<FilterAttribute> savePreferences(){
        return null;
    }
    
    /**
     * @return the preferences
     */
    public ArrayList<FilterAttribute> getPreferences() {
        return preferences;
    }

    /**
     * @param preferences the preferences to set
     */
    public void setPreferences(ArrayList<FilterAttribute> preferences) {
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
}
