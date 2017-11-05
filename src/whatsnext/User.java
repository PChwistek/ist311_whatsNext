package whatsnext;

import java.util.*;
/**
 *
 * @author kmk6138
 */
public class User
{

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
    private String username;
    private String password;
  
    //constructor
    public User()
    {
        this.username = "";
        this.password = "";
    }
    public User(String un, String pw){
        this.username = un;
        this.password = pw;                
    }
    
    public boolean isEqual(String un, String pw){
        return un.equals(this.getUsername()) && pw.equals(this.getPassword());
    }
} 
