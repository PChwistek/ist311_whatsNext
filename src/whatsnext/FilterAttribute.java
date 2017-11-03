/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

/**
 *
 * @author kristinakvasny
 */
public class FilterAttribute {
    private String attributeName;
    private String attributeCategory;
    
    
    public FilterAttribute(String an, String ac){
        this.attributeName = an;
        this.attributeCategory = ac;
    }

    /**
     * @return the attributeName
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * @param attributeName the attributeName to set
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * @return the attributeCategory
     */
    public String getAttributeCategory() {
        return attributeCategory;
    }

    /**
     * @param attributeCategory the attributeCategory to set
     */
    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory;
    }
}
