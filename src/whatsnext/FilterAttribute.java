/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Philz zee Kill
 */
public class FilterAttribute {
    
    private String name;
    
    private Sentiment sent;
    
    private String sentString;
    
    public enum Sentiment{
        POSITIVE, NEGATIVE
    }
    
    public FilterAttribute(String aName, Sentiment aSent){
        this.name = aName;
        this.sent = aSent;
        this.sentString = getSentimentAsString();
    }
    
    public String getSentimentAsString(){
        String temp = "";
        if(this.sent == Sentiment.POSITIVE){
            temp = "Positive";
        } else {
            temp = "Negative";
        }
        return temp;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sent
     */
    public Sentiment getSent() {
        return sent;
    }

    /**
     * @param sent the sent to set
     */
    public void setSent(Sentiment sent) {
        this.sent = sent;
    }
    
    /**
     * @return the sentString
     */
    public String getSentString() {
        return sentString;
    }

    /**
     * @param sentString the sentString to set
     */
    public void setSentString(String sentString) {
        this.sentString = sentString;
    }
    
    
}
