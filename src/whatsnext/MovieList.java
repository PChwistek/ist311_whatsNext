/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Philz zee Kill
 */
public class MovieList implements Serializable{
    
    private ArrayList<Movie> theMovieList = null;
    
    public MovieList(){
        theMovieList = generateDummyData();
    }
    
    private ArrayList<Movie> generateDummyData(){
        
        ArrayList<Movie> tempList = new ArrayList();
        ProductionPersonList tempProductionList = new ProductionPersonList();
        FilterableList tempAttributeList = new FilterableList();
        
        // movie1
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
        tempAttributeList = new FilterableList();
        
        // movie 2        
        String description1 = "When the menace known as the Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham, the Dark Knight must accept one of the greatest psychological and physical tests of his ability to fight injustice.";
        Movie theDarkKnight = new Movie("The Dark Knight", description1, "18 July 2008", "", "Warner Bros", 152);
        // its filter attributes
        tempAttributeList.addAttribute(new Genre("Crime", "Thrill"));
        tempAttributeList.addAttribute(new Genre("Action", "Superhero"));
        tempAttributeList.addAttribute(new Genre("Drama", "Intense"));
        tempAttributeList.addAttribute(new MPAARating("PG-13", "13+"));
        // its production people
        tempProductionList.add(new ProductionPerson("Christopher", "Nolan", "Director"));
        tempProductionList.add(new ProductionPerson("Christian", "Bale", "Actor"));
        tempProductionList.add(new ProductionPerson("Heath", "Ledger", "Actor"));
        tempProductionList.add(new ProductionPerson("Aaron", "Eckhart", "Actor"));
        tempProductionList.add(new ProductionPerson("Michael", "Caine", "Actor"));
        tempProductionList.add(new ProductionPerson("Maggie", "Gyllenhaal", "Actor"));
        
        theDarkKnight.setTheFilterAttributeList(tempAttributeList);
        theDarkKnight.setTheProductionPersonList(tempProductionList);
        
        tempProductionList = new ProductionPersonList(); 
        tempAttributeList = new FilterableList();
        
        // movie 3
        String description2 = "An insomniac office worker, looking for a way to change his life, crosses paths with a devil-may-care soap maker, forming an underground fight club that evolves into something much, much more.";
        Movie fightClub = new Movie("Fight Club", description2, "15 October 1999", "", "Fox 2000 Pictures", 139);
        // its filter attributes
        tempAttributeList.addAttribute(new Genre("Drama", "Thrill"));
        tempAttributeList.addAttribute(new MPAARating("R", "17+"));
        // its production people
        tempProductionList.add(new ProductionPerson("David", "Fincher", "Director"));
        tempProductionList.add(new ProductionPerson("Edward", "Norton", "Actor"));
        tempProductionList.add(new ProductionPerson("Brad", "Pitt", "Actor"));
        tempProductionList.add(new ProductionPerson("Meat", "Loaf", "Actor"));
        tempProductionList.add(new ProductionPerson("Helena", "Bonham", "Actor"));
        tempProductionList.add(new ProductionPerson("Jared", "Leto", "Actor"));
        
        fightClub.setTheFilterAttributeList(tempAttributeList);
        fightClub.setTheProductionPersonList(tempProductionList);
        
        tempProductionList = new ProductionPersonList(); 
        tempAttributeList = new FilterableList();
        
        //movie 4
        String description3 = "JFK, LBJ, Vietnam, Watergate, and other history unfold through the perspective of an Alabama man with an IQ of 75.";
        Movie forrestGump = new Movie("Forrest Gump", description3, "6 July 1994", "", "Paramount Pictures", 142);
        // its filter attributes
        tempAttributeList.addAttribute(new Genre("Drama", "Comedy"));
        tempAttributeList.addAttribute(new Genre("Romance", "Comedy"));
        tempAttributeList.addAttribute(new MPAARating("PG-13", "13+"));
        // its production people
        tempProductionList.add(new ProductionPerson("Robert", "Zemeckis", "Director"));
        tempProductionList.add(new ProductionPerson("Tom", "Hanks", "Actor"));
        tempProductionList.add(new ProductionPerson("Robin", "Wright", "Actor"));
        tempProductionList.add(new ProductionPerson("Gary", "Sinise", "Actor"));
        tempProductionList.add(new ProductionPerson("Sally", "Field", "Actor"));
        
        forrestGump.setTheFilterAttributeList(tempAttributeList);
        forrestGump.setTheProductionPersonList(tempProductionList);
        
        tempProductionList = new ProductionPersonList(); 
        tempAttributeList = new FilterableList();
        
        // movie 5
        String description4 = "Lion cub and future king Simba searches for his identity. His eagerness to please others and penchant for testing his boundaries sometimes gets him into trouble.";
        Movie theLionKing = new Movie("The Lion King", description4, "24 June 1994", "", "Walt Disney Pictures", 88);
        // its filter attributes
        tempAttributeList.addAttribute(new Genre("Animation", "Family"));
        tempAttributeList.addAttribute(new Genre("Adventure", "Musical"));
        tempAttributeList.addAttribute(new Genre("Drama", "Musical"));
        tempAttributeList.addAttribute(new MPAARating("G", "All ages"));
        // its production people
        tempProductionList.add(new ProductionPerson("Roger", "Allers", "Director"));
        tempProductionList.add(new ProductionPerson("Rob", "Minkoff", "Director"));
        tempProductionList.add(new ProductionPerson("Matthew", "Broderick", "Actor"));
        tempProductionList.add(new ProductionPerson("James", "Earl Jones", "Actor"));
        tempProductionList.add(new ProductionPerson("Jeremy", "Irons", "Actor"));
        
        theLionKing.setTheFilterAttributeList(tempAttributeList);
        theLionKing.setTheProductionPersonList(tempProductionList);
        
        tempProductionList = new ProductionPersonList(); 
        tempAttributeList = new FilterableList();    
        
        tempList.add(pulpFiction);
        tempList.add(theDarkKnight);
        tempList.add(fightClub);
        tempList.add(forrestGump);
        tempList.add(theLionKing);
        
        return tempList;
    }
    
    public Movie findMovie(String title){
        for(Movie temp: theMovieList){
            if(temp.getTitle().equals(title)){
                return temp;
            }
        }
        System.out.println("movie not found in list");
        return null;
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
