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
public class MovieList {
    
    private ArrayList<Movie> theMovieList = null;
    
    public MovieList(){
        theMovieList = generateDummyData();
    }
    
    private ArrayList<Movie> generateDummyData(){
        
        ArrayList<Movie> tempList = new ArrayList();
        ProductionPersonList tempProductionList = new ProductionPersonList();
        FilterAttributeList tempAttributeList = new FilterAttributeList();
        
        //create a movie1 ===================================================
        String description = "The lives of two mob hit men, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption.";
        Movie pulpFiction = new Movie("Pulp Fiction", description, "14 October 1994", "", "Miramax Films", 154);
        // its filter attributes
        tempAttributeList.addAttribute(new Genre("Crime", "Thrill"));
        tempAttributeList.addAttribute(new Genre("Drama", "Tension"));
        tempAttributeList.addAttribute(new MPAARating("R", "17+"));
        // its production people
        tempProductionList.add(new ProductionPerson("Quintin", "Tarantino", "Director"));
        tempProductionList.add(new ProductionPerson("Samuel", "L. Jackson", "Actor"));
        tempProductionList.add(new ProductionPerson("John", "Travolta", "Actor"));
        tempProductionList.add(new ProductionPerson("Tim", "Roth", "Actor"));
        tempProductionList.add(new ProductionPerson("Bruce", "Willis", "Actor"));
        tempProductionList.add(new ProductionPerson("Uma", "Thurman", "Actor"));
        
        pulpFiction.setTheFilterAttributeList(tempAttributeList);
        pulpFiction.setTheProductionPersonList(tempProductionList);
        
        tempProductionList = new ProductionPersonList(); // reset these variables
        tempAttributeList = new FilterAttributeList();
        
        //create movie 2 =====================================================================
        
        
        
        
        
        
        tempList.add(pulpFiction);

        return tempList;
    }

    /**
     * @return the theMovieList
     */
    public ArrayList<Movie> getTheMovieList() {
        return theMovieList;
    }

    /**
     * @param theMovieList the theMovieList to set
     */
    public void setTheMovieList(ArrayList<Movie> theMovieList) {
        this.theMovieList = theMovieList;
    }
    
    
}
