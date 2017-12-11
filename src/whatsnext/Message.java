/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.Serializable;

/**
 *
 * @author Philz zee Kill
 */
public class Message implements Serializable{
    
    private String recipient;
    private String sender;
    private String bodyText;
    private Recommendation theRecommendation;
    
    public Message(String aRecipient, String aSender, String aBodyText, Recommendation aRec){
        this.recipient = aRecipient;
        this.sender = aSender;
        this.bodyText = aBodyText;
        this.theRecommendation = aRec;
    }

    /**
     * @return the recipient
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * @param recipient the recipient to set
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * @return the sender
     */
    public String getSender() {
        return sender;
    }

    /**
     * @param sender the sender to set
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * @return the bodyText
     */
    public String getBodyText() {
        return bodyText;
    }

    /**
     * @param bodyText the bodyText to set
     */
    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    /**
     * @return the theRecommendation
     */
    public Recommendation getTheRecommendation() {
        return theRecommendation;
    }

    /**
     * @param theRecommendation the theRecommendation to set
     */
    public void setTheRecommendation(Recommendation theRecommendation) {
        this.theRecommendation = theRecommendation;
    }
    
}
