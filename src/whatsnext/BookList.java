/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.util.ArrayList;

/**
 *
 * @author Philz zee Kill
 */
public class BookList {
    
    private ArrayList<Book> theBookList = null;
    
    public BookList(){
        theBookList = generateDummyData();
    }
    
    private ArrayList<Book> generateDummyData(){
        return null;
    }

    /**
     * @return the theBookList
     */
    public ArrayList<Book> getTheBookList() {
        return theBookList;
    }

    /**
     * @param theBookList the theBookList to set
     */
    public void setTheBookList(ArrayList<Book> theBookList) {
        this.theBookList = theBookList;
    }
    
}
