/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.Serializable;

/**
 *
 * @author kristinakvasny
 */
public class Genre implements Filterable, Serializable{
    
    private String genreName;
    private String genreEmotion;

    public Genre(String gn, String ge) {
        this.genreName = gn;
        this.genreEmotion = ge;
    }
    
    @Override
    public String getType() {
        return "Genre"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return this.genreName;
    }

    
    /**
     * @return the genreName
     */
    public String getGenreName() {
        return genreName;
    }

    /**
     * @param genreName the genreName to set
     */
    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    /**
     * @return the genreEmotion
     */
    public String getGenreEmotion() {
        return genreEmotion;
    }

    /**
     * @param genreEmotion the genreEmotion to set
     */
    public void setGenreEmotion(String genreEmotion) {
        this.genreEmotion = genreEmotion;
    }
    
}
