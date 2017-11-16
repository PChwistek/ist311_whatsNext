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
public class ProductionPersonList {
    
    private ArrayList<ProductionPerson> theProductionPersonList = null;
    
    public ProductionPersonList(){
        
    }

    public void add(ProductionPerson aPerson){
        this.theProductionPersonList.add(aPerson);
    }
    /**
     * @return the theProductionPersonList
     */
    public ArrayList<ProductionPerson> getTheProductionPersonList() {
        return theProductionPersonList;
    }

    /**
     * @param theProductionPersonList the theProductionPersonList to set
     */
    public void setTheProductionPersonList(ArrayList<ProductionPerson> theProductionPersonList) {
        this.theProductionPersonList = theProductionPersonList;
    }
    
    
    
}
