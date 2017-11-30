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
public class PersistentDataCollection implements Serializable {
    
    private UserList theUserList;
    private MovieList theMovieList;
    private BookList theBookList;
    
    public PersistentDataCollection(){
        if(theUserList == null){
            theUserList = new UserList();
        }
        if(theMovieList == null){
            theMovieList = new MovieList();
        }
        if(theBookList == null){
            theBookList = new BookList();
        }
    }

    /**
     * @return the theUserList
     */
    public UserList getTheUserList() {
        return theUserList;
    }

    /**
     * @param theUserList the theUserList to set
     */
    public void setTheUserList(UserList theUserList) {
        this.theUserList = theUserList;
    }

    /**
     * @return the theMovieList
     */
    public MovieList getTheMovieList() {
        return theMovieList;
    }

    /**
     * @param theMovieList the theMovieList to set
     */
    public void setTheMovieList(MovieList theMovieList) {
        this.theMovieList = theMovieList;
    }

    /**
     * @return the theBookList
     */
    public BookList getTheBookList() {
        return theBookList;
    }

    /**
     * @param theBookList the theBookList to set
     */
    public void setTheBookList(BookList theBookList) {
        this.theBookList = theBookList;
    }
}
