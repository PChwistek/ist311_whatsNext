package whatsnext;

import java.util.ArrayList;

public class Profile {
   
    private ArrayList<FilterAttribute> preferences = new ArrayList();
    private ArrayList<Profile> accountInfo = new ArrayList();
    
    private String firstName;
    private String lastName;
    private String email;
    
    public Profile(String fn, String ln, String e){
        this.preferences = savePreferences();
        this.firstName = fn;
        this.lastName = ln;
        this.email = e;
    }
    
    //saves preferences from genre, keyword, and MPAA rating attribute lists into profile
    public ArrayList<FilterAttribute> savePreferences(){
        //getPreferences().add(new FilterAttributeList().getListOfGenreAttributes().get(0));
        //getPreferences().add(new FilterAttributeList().getListOfGenreAttributes().get(4));
       // getPreferences().add(new FilterAttributeList().getListOfKeywordAttributes().get(0));
       // getPreferences().add(new FilterAttributeList().getListOfKeywordAttributes().get(11));
        //getPreferences().add(new FilterAttributeList().getListOfMPAARatingAttributes().get(3));
        return getPreferences();
    }
    
    //gets account info and saves it
    public ArrayList<Profile> getInfo(){
        getAccountInfo().add(new Profile("Joe", "Smith", "joesmith1@gmail.com"));
        return getAccountInfo();
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
     * @return the accountInfo
     */
    public ArrayList<Profile> getAccountInfo() {
        return accountInfo;
    }

    /**
     * @param accountInfo the accountInfo to set
     */
    public void setAccountInfo(ArrayList<Profile> accountInfo) {
        this.accountInfo = accountInfo;
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
