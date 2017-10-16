package whatsnext;

import java.util.ArrayList;
import java.util.HashMap;

public class UserList
{
    private HashMap<String, String> listOfUsers;
    private User userClass;
    
    //constructor
    public UserList()
    {
    }
    
    //Verify that the user exists
    public boolean verifyLogin(String usernameInput, String passwordInput)
    {
        boolean loginSuccess = false;
        boolean userExists = false;
        
        //check that hashmap listOfUsers contains key (username)
        if (userExists == true)
        {
            //Pass boolean decision to verifyPassword (method below)
            loginSuccess = verifyPassword(usernameInput, passwordInput);
        }
        
        return loginSuccess;
    }
    
    //verify the password
    public boolean verifyPassword(String username, String password)
    {
        boolean passwordCorrect = false;
        String usernameInput = username;
        String passwordInput = password;
        String passwordActual = listOfUsers.get(usernameInput);
        
        if (passwordInput.equals(passwordActual))
        {
            passwordCorrect = true;
        }
        
        return passwordCorrect;
    }
    
       //in this class or User class?
    public HashMap populateListOfUsers()
    {
        listOfUsers.put("adrianne", "kubiak.pass");
        listOfUsers.put("kristina", "kvasny.pass");
        listOfUsers.put("phil", "chwistek.pass");
        listOfUsers.put("zi", "yang.pass");
        
        System.out.println("Populated: " + listOfUsers.keySet());
        return listOfUsers;
    }
}