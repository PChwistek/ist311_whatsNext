/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.util.ArrayList;

/**
 *
 * @author Philz zee Kill
 */
public class MergedProfile {
    
    private String username;
    private String password;
    private ArrayList<Media> history = new ArrayList(); 
    
    public MergedProfile(){
        this.username = "";
        this.password = "";
    }
    
    public MergedProfile(User user){
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.history = user.getProfile().getHistory();
        System.out.println("Merged!");
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
    
    
}
