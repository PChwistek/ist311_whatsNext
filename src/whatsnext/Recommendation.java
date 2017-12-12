/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Philz zee Kill
 */
public class Recommendation implements Serializable {
    
    private Media mediaToRecommend = null;
    private int strength;
    private MediaType type;
    private ArrayList<FilterAttribute> matchedAttributes = null;
    
    public enum MediaType{
        FILM, BOOK
    }
    
    public Recommendation(Media aMedia, int aStrength, MediaType aType){
        this.mediaToRecommend = aMedia;
        this.strength = aStrength;
        this.type = aType;
    }
    
    /**
     * @return the mediaToRecommend
     */
    public Media getMediaToRecommend() {
        return mediaToRecommend;
    }

    /**
     * @param mediaToRecommend the mediaToRecommend to set
     */
    public void setMediaToRecommend(Media mediaToRecommend) {
        this.mediaToRecommend = mediaToRecommend;
    }

    /**
     * @return the strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * @param strength the strength to set
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * @return the type
     */
    public MediaType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(MediaType type) {
        this.type = type;
    }

    /**
     * @return the matchedAttributes
     */
    public ArrayList<FilterAttribute> getMatchedAttributes() {
        return matchedAttributes;
    }

    /**
     * @param matchedAttributes the matchedAttributes to set
     */
    public void setMatchedAttributes(ArrayList<FilterAttribute> matchedAttributes) {
        this.matchedAttributes = matchedAttributes;
    }
    
    
    
}
