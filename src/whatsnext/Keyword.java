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
public class Keyword implements Filterable, Serializable {

    private String keyword;
    private String keywordType;
    
    public Keyword(String an, String ac, String k, String kt) {
        this.keyword = k;
        this.keywordType = kt;
    }
    
    @Override
    public String getType() {
        return this.keywordType;
    }

    @Override
    public String getName() {
        return this.keyword;
    }

    /**
     * @return the keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * @param keyword the keyword to set
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * @return the keywordType
     */
    public String getKeywordType() {
        return keywordType;
    }

    /**
     * @param keywordType the keywordType to set
     */
    public void setKeywordType(String keywordType) {
        this.keywordType = keywordType;
    }
}
