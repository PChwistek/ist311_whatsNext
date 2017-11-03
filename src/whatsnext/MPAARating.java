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
public class MPAARating extends FilterAttribute{

    private String rating;
    private String ageRating;
    
    public MPAARating(String an, String ac, String r, String ar) {
        super(an, ac);
        this.rating = r;
        this.ageRating = ar;
    }

    /**
     * @return the rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * @return the ageRating
     */
    public String getAgeRating() {
        return ageRating;
    }

    /**
     * @param ageRating the ageRating to set
     */
    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }
    
}
