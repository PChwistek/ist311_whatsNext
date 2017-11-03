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
public class Genre extends FilterAttribute{
    
    private String genreName;
    private String genreEmotion;

    public Genre(String an, String ac, String gn, String ge) {
        super(an, ac);
        this.genreName = gn;
        this.genreEmotion = ge;
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
