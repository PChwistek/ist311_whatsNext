/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.util.Comparator;

/**
 *
 * @author Philz zee Kill
 */
public class Recommendation {
    
    private Media mediaToRecommend;
    private int strength;
    private MediaType type;
    
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
    
    
    
}
