/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.Serializable;

/**
 *
 * @author Zi Yang
 */
public abstract class Media implements Serializable {
    private String title;
    private String description;
    private String releaseDate;
    private String dateViewed;
    private ProductionPersonList theProductionPersonList;
    private FilterableList theFilterAttributeList; 
    
    
    public Media(String aTitle, String aDescription, String aReleaseDate, String aDateUsed){
        this.title = aTitle;
        this.description = aDescription;
        this.releaseDate = aReleaseDate;
        this.dateViewed = aDateUsed;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the releaseDate to set
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return the dateUsed
     */
    public String getDateViewed() {
        return dateViewed;
    }

    /**
     * @param dateUsed the dateUsed to set
     */
    public void setDateViewedString(String dateViewed) {
        this.dateViewed = dateViewed;
    }

    /**
     * @return the theProductionPersonList
     */
    public ProductionPersonList getTheProductionPersonList() {
        return theProductionPersonList;
    }

    /**
     * @param theProductionPersonList the theProductionPersonList to set
     */
    public void setTheProductionPersonList(ProductionPersonList theProductionPersonList) {
        this.theProductionPersonList = theProductionPersonList;
    }

    /**
     * @return the theFilterAttributeList
     */
    public FilterableList getTheFilterAttributeList() {
        return theFilterAttributeList;
    }

    /**
     * @param theFilterAttributeList the theFilterAttributeList to set
     */
    public void setTheFilterAttributeList(FilterableList theFilterAttributeList) {
        this.theFilterAttributeList = theFilterAttributeList;
    }
    
}
