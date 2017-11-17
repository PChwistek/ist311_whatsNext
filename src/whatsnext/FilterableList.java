/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.util.ArrayList;

/**
 *
 * @author kristinakvasny
 */
public class FilterableList {
    ArrayList<Filterable> listOfAttributes = new ArrayList();
    
    public FilterableList(){
        
    }
    
    public ArrayList<Filterable> populateAttributeList(){
        return null;
    }
    
    public void addAttribute(Filterable anAttribute){
        this.listOfAttributes.add(anAttribute);
    }
}
