package whatsnext;

import java.util.*;
/**
 *
 * @author kmk6138
 */
public class User
{
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
        return un.equals(this.username) && pw.equals(this.password);
    }
} 
