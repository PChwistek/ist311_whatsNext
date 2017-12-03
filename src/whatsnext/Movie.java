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
public class Movie extends Media implements Serializable {
    
    private String filmStudio;
    private int filmLength;
    
    public Movie(){
        super("","","","");
    }
    
    public Movie(String aTitle, String aDescription, String aReleaseDate, String aDateUsed, String aFilmStudio, int aFilmLength){
    
        super(aTitle, aDescription, aReleaseDate, aDateUsed);
        this.filmStudio = aFilmStudio;
        this.filmLength = aFilmLength;
    }
    

    /**
     * @return the filmStudio
     */
    public String getFilmStudio() {
        return filmStudio;
    }

    /**
     * @param filmStudio the filmStudio to set
     */
    public void setFilmStudio(String filmStudio) {
        this.filmStudio = filmStudio;
    }

    /**
     * @return the filmLength
     */
    public int getFilmLength() {
        return filmLength;
    }

    /**
     * @param filmLength the filmLength to set
     */
    public void setFilmLength(int filmLength) {
        this.filmLength = filmLength;
    }

  
}
