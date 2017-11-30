package whatsnext;

import java.io.Serializable;
import java.util.*;
/**
 *
 * @author kmk6138
 */
public class User implements Serializable
{
    private String username;
    private String password;
    private Profile profile; 
  
    //constructor
    public User(){
        this.username = "JohnDoe";
        this.password = "pass";
        this.profile = new Profile();
    }
    
    public User(String un, String pw){
        this.username = un;
        this.password = pw;
        this.profile = new Profile();
    }
    
    public User(String un, String pw, Profile aProfile){
        this.username = un;
        this.password = pw;
        this.profile = aProfile;
    }
    
    public boolean isEqual(String un, String pw){
        return un.equals(this.username) && pw.equals(this.password);
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
    
    public Profile getProfile(){
        return this.profile;
    }
    
    public void setProfile(Profile profileToSet){
        this.profile = profileToSet;
    }
} 
