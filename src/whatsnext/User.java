package whatsnext;

import java.util.*;
/**
 *
 * @author kmk6138
 */
public class User
{
    private HashMap<String, String> listOfUsers;
    private String username;
    private String password;
  
    //constructor
    public User()
    {
        this.listOfUsers = new HashMap();
        this.username = "";
        this.password = "";
    }
    public User(HashMap listOfUsers, String un, String pw){
        this.listOfUsers = listOfUsers;
        this.username = un;
        this.password = pw;                
    }
    
    //in this class or UserList class?
    public HashMap populateListOfUsers()
    {
        listOfUsers.put("adrianne", "kubiak.pass");
        listOfUsers.put("kristina", "kvasny.pass");
        listOfUsers.put("phil", "chwistek.pass");
        listOfUsers.put("zi", "yang.pass");
        
        System.out.println("Populated: " + listOfUsers.keySet());
        return listOfUsers;
    }
    
    
    public boolean isEqual(String un, String pw){
        return un.equals(this.username) && pw.equals(this.password);
    }
} 
