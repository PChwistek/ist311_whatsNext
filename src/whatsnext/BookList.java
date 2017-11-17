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
        ArrayList<Book> tempList = new ArrayList();
        ProductionPersonList tempProductionList = new ProductionPersonList();
        FilterableList tempAttributeList = new FilterableList();  
        
        // book1
        String description = "No one ever said life was easy. But Ponyboy is pretty sure that he's got things figured out. He knows that he can count on his brothers, Darry and Sodapop. And he knows that he can count on his friends—true friends who would do anything for him, like Johnny and Two-Bit. But not on much else besides trouble with the Socs, a vicious gang of rich kids whose idea of a good time is beating up on “greasers” like Ponyboy. At least he knows what to expect—until the night someone takes things too far.";
        Book theOutsiders = new Book("The Outsiders", description, "20 April 2006", "", "Speak", "Platinum", 224);
        // its filter attributes
        tempAttributeList.addAttribute(new Genre("Classic", "Drama"));
        tempAttributeList.addAttribute(new Genre("Fiction", "Coming-of-age"));
        // its production people
        tempProductionList.add(new ProductionPerson("S.E.", "Hinton", "Author"));
        
        theOutsiders.setTheFilterAttributeList(tempAttributeList);
        theOutsiders.setTheProductionPersonList(tempProductionList);
        
        tempProductionList = new ProductionPersonList(); 
        tempAttributeList = new FilterableList();
        
        // book2
        String description1 = "Berlin, 1942: When Bruno returns home from school one day, he discovers that his belongings are being packed in crates. His father has received a promotion and the family must move to a new house far, far away, where there is no one to play with and nothing to do. A tall fence stretches as far as the eye can see and cuts him off from the strange people in the distance.\n" +
" \n" +
"But Bruno longs to be an explorer and decides that there must be more to this desolate new place than meets the eye. While exploring his new environment, he meets another boy whose life and circumstances are very different from his own, and their meeting results in a friendship that has devastating consequences.";
        Book theBoyInTheStripedPajamas = new Book("The Boy in the Striped Pajamas", description1, "23 October 2007", "", "David Fickling Books", "Reprint", 215);
        // its filter attributes
        tempAttributeList.addAttribute(new Genre("Fiction", "Historical"));
        // its production people
        tempProductionList.add(new ProductionPerson("John", "Boyne", "Author"));
        
        theBoyInTheStripedPajamas.setTheFilterAttributeList(tempAttributeList);
        theBoyInTheStripedPajamas.setTheProductionPersonList(tempProductionList);
        
        tempProductionList = new ProductionPersonList(); 
        tempAttributeList = new FilterableList();
        
        // book3
        String description2 = "Isabella Swan's move to Forks, a small, perpetually rainy town in Washington, could have been the most boring move she ever made. But once she meets the mysterious and alluring Edward Cullen, Isabella's life takes a thrilling and terrifying turn. Up until now, Edward has managed to keep his vampire identity a secret in the small community he lives in, but now nobody is safe, especially Isabella, the person Edward holds most dear. The lovers find themselves balanced precariously on the point of a knife-between desire and danger.Deeply romantic and extraordinarily suspenseful, Twilight captures the struggle between defying our instincts and satisfying our desires. This is a love story with bite.";
        Book twilight = new Book("Twilight", description2, "6 September 2006", "", "Little, Brown Books for Young Readers", "First", 544);
        // its filter attributes
        tempAttributeList.addAttribute(new Genre("Paranormal Romance", "Vampires"));
        tempAttributeList.addAttribute(new Genre("Fiction", "Fantasy"));
        // its production people
        tempProductionList.add(new ProductionPerson("Stephenie", "Meyer", "Author"));
        
        twilight.setTheFilterAttributeList(tempAttributeList);
        twilight.setTheProductionPersonList(tempProductionList);
        
        tempProductionList = new ProductionPersonList(); 
        tempAttributeList = new FilterableList();
        
        // book4
        String description3 = "In the ruins of a place once known as North America lies the nation of Panem, a shining Capitol surrounded by twelve outlying districts. Long ago the districts waged war on the Capitol and were defeated. As part of the surrender terms, each district agreed to send one boy and one girl to appear in an annual televised event called, \"The Hunger Games,\" a fight to the death on live TV. Sixteen-year-old Katniss Everdeen, who lives alone with her mother and younger sister, regards it as a death sentence when she is forced to represent her district in the Games. The terrain, rules, and level of audience participation may change but one thing is constant: kill or be killed.";
        Book theHungerGames = new Book("The Hunger Games", description3, "3 July 2010", "", "Scholastic Press", "Reprint", 384);
        // its filter attributes
        tempAttributeList.addAttribute(new Genre("Sci-Fi", "Dystopian"));
        tempAttributeList.addAttribute(new Genre("Fiction", "Adventure"));
        // its production people
        tempProductionList.add(new ProductionPerson("Suzanne", "Collins", "Author"));
        
        theHungerGames.setTheFilterAttributeList(tempAttributeList);
        theHungerGames.setTheProductionPersonList(tempProductionList);
        
        tempProductionList = new ProductionPersonList(); 
        tempAttributeList = new FilterableList();
        
        // book5
        String description4 = "The Giver, the 1994 Newbery Medal winner, has become one of the most influential novels of our time. The haunting story centers on twelve-year-old Jonas, who lives in a seemingly ideal, if colorless, world of conformity and contentment. Not until he is given his life assignment as the Receiver of Memory does he begin to understand the dark, complex secrets behind his fragile community. Lois Lowry has written three companion novels to The Giver, including Gathering Blue, Messenger, and Son.";
        Book theGiver = new Book("The Giver", description4, "1 July 2014", "", "HMH Books for Young Readers", "Reprint", 240);
        // its filter attributes
        tempAttributeList.addAttribute(new Genre("Sci-Fi", "Dystopian"));
        tempAttributeList.addAttribute(new Genre("Fiction", "Fantasy"));
        // its production people
        tempProductionList.add(new ProductionPerson("Lois", "Lowry", "Author"));
        
        theGiver.setTheFilterAttributeList(tempAttributeList);
        theGiver.setTheProductionPersonList(tempProductionList);
        
        tempProductionList = new ProductionPersonList(); 
        tempAttributeList = new FilterableList();
        
        tempList.add(theOutsiders);
        tempList.add(theBoyInTheStripedPajamas);
        tempList.add(twilight);
        tempList.add(theHungerGames);
        tempList.add(theGiver);
        
        return tempList;
        
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
