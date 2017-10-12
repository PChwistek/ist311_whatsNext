/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

/**
 *
 * @author kmk6138
 */
public class User
{
    private String username;
    private String password;
  
    public User(String un, String pw){
        this.username = un;
        this.password = pw;
        
    }
    
    public boolean isEqual(String un, String pw){
        return un.equals(this.username) && pw.equals(this.password);
    }

    /**
     * @return the username
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
} 
