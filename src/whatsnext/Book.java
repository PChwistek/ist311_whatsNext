/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

/**
 *
 * @author Zi Yang
 */
public class Book extends Media {
    private String publisher;
    private String edition;
    private int numPages;
    
    public Book(){
        super("", "", "", "");
        this.publisher = "";
        this.edition = "";
        this.numPages = 0;
    }
    
    public Book(String aTitle, String aDescription, String aReleaseDate, String aDateUsed, String aPublisher, String aEdition, int aNumPages){
        super(aTitle, aDescription, aReleaseDate, aDateUsed);
        this.edition = aEdition;
        this.publisher = aPublisher;
        this.numPages = aNumPages;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the edition
     */
    public String getEdition() {
        return edition;
    }

    /**
     * @param edition the edition to set
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * @return the numPages
     */
    public int getNumPages() {
        return numPages;
    }

    /**
     * @param numPages the numPages to set
     */
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}
