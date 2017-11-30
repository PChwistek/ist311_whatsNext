/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.Serializable;

/**
 *
 * @author Philz zee Kill
 */
public class ProductionPerson implements Filterable, Serializable {
    
    private String firstName;
    private String lastName;
    private String occupation; 
    
    public ProductionPerson(){
        firstName = "John";
        lastName = "Doe";
        occupation = "Director";
    }
    
    public ProductionPerson(String aFirstName, String aLastName, String aOccupation){
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.occupation = aOccupation;
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
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String getType() {
        return this.occupation;
    }

    @Override
    public String getName() {
        return this.firstName + " " + this.lastName;
    }
    
    
    
}
