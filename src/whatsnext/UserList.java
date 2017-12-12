package whatsnext;

import java.io.Serializable;
import java.util.ArrayList;

public class UserList implements Serializable
{
    private ArrayList<User> listOfUsers = new ArrayList();
    
    //constructor
    public UserList()
    {
        listOfUsers = populateListOfUsers();
    }
    
    //Verify that the user exists
    public boolean verifyLogin(String usernameInput, String passwordInput)
    {
        for(User aUser: listOfUsers){
            System.out.println(aUser.getUsername());
            if(aUser.isEqual(usernameInput, passwordInput)){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<User> populateListOfUsers()
    {
        listOfUsers.add(new User("adrianne", "kubiak.pass"));
        listOfUsers.add(new User("kristina", "kvasny.pass"));
        listOfUsers.add(new User("phil", "chwistek.pass"));
        listOfUsers.add(new User("zi", "yang.pass"));
        System.out.println("Populated: " + listOfUsers.size());
        return listOfUsers;
    }
    
    public boolean addUserTolist(User userToAdd){
        boolean success = true;
        for(User temp: listOfUsers){
            boolean sameUsername = temp.getUsername().equals(userToAdd.getUsername());
            if(sameUsername){
                success = false;
                return success;
            }
        }
        listOfUsers.add(userToAdd);
        return success;
    }
    
    public User getUserFromList(String username){
        for(User temp: listOfUsers){
            if(temp.getUsername().equals(username)){
                return temp;
            }
        }
        System.out.println("user not found in list");
        return null;
    }
}