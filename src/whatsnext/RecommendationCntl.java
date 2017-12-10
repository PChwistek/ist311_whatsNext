/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Philz zee Kill
 */
public class RecommendationCntl {
    
    
    private RecommendationUICntl theRecUICntl;
    private Stage stage;
    private String theCurrentUser;
    private UserList theListOfUsers;
    private NavCntl theNavCntl = null;
    private BookList theBookList = null;
    private MovieList theMovieList = null;
    
    public RecommendationCntl(Stage aStage){
        this.stage = aStage;
        theNavCntl = NavCntl.getNavCntl(aStage);
        this.theCurrentUser = theNavCntl.getTheCurrentUser(); //already got from ser in Nav cntl
        this.theListOfUsers = theNavCntl.getTheListOfUsers();
        theBookList = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getTheBookList();
        theMovieList = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getTheMovieList();
        setRecScene(stage);
    }
    
    public void goToNav(){
        this.theNavCntl.setNavScene(stage);
        PersistentDataCntl.getPersistentDataCntl().writeSerializedDataCollection();
    }
    
    public void setRecScene(Stage stage){
        
         try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RecommendationUI.fxml"));
            Parent login = loader.load();
            theRecUICntl = loader.getController();
            theRecUICntl.setRecommendationCntl(this);
            Scene scene = new Scene(login);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
    public Profile getCurrentUserProfile(){
        return theListOfUsers.getUserFromList(theCurrentUser).getProfile();
    }
    
    public void updateCurrentUserProfile(Profile profileToSet){
        theListOfUsers.getUserFromList(theCurrentUser).setProfile(profileToSet);
    }
    
    public ArrayList<Recommendation> makeRecommendations(boolean filmToggled, ObservableList<FilterAttribute> filterAttributeList){
        
        int numPros = 0;
        FilterAttribute[] userFilters = new FilterAttribute[filterAttributeList.size()];
        filterAttributeList.toArray(userFilters);
        ArrayList<? extends Media> mediaToSearch = null;
        Recommendation temp = null;
        
        ArrayList<Recommendation> mediaToRecommend = new ArrayList(); 
        
        if(filmToggled){
            mediaToSearch = theMovieList.getTheMovieList();
        } else {
            mediaToSearch = theBookList.getTheBookList();
        }
        
        //bad algorithm O(n^3) but oh well
        for(Media item: mediaToSearch){
            ArrayList<Filterable> mediaFilters = null;
            ArrayList<FilterAttribute> matchedAttributes = new ArrayList();
            mediaFilters = (ArrayList<Filterable>)item.getTheFilterAttributeList().listOfAttributes.clone(); //otherwise modifies the real one
            mediaFilters.addAll(item.getTheProductionPersonList().getTheProductionPersonList());
            
            for(Filterable filter: mediaFilters){
                for(FilterAttribute att: userFilters){
                    if(att.getName().equalsIgnoreCase(filter.getName())){
                        if(att.getSent() == FilterAttribute.Sentiment.POSITIVE){
                            numPros += 1;
                            matchedAttributes.add(att);
                        } else {
                            numPros -= 1;
                        }
                    }
                }
            }
            if(filmToggled){
                temp = new Recommendation(item, numPros, Recommendation.MediaType.FILM);
                temp.setMatchedAttributes(matchedAttributes);
            } else {
                temp = new Recommendation(item, numPros, Recommendation.MediaType.BOOK);
                temp.setMatchedAttributes(matchedAttributes);
            }
            mediaToRecommend.add(temp);
            numPros = 0;
        } 
        
        mediaToRecommend.sort(new MyRecommendationComp());
        
        for(Recommendation r: mediaToRecommend ){
            System.out.println(r.getMediaToRecommend().getTitle() + ";" + r.getStrength());
        }
        System.out.println(" ============================== ");
        return mediaToRecommend;
    }
    
    public ArrayList<Filterable> makeHistoryFilter(){
        
        ArrayList<Filterable> tempList = new ArrayList();
        
        ArrayList<Media> theHistory = theListOfUsers.getUserFromList(theCurrentUser).getProfile().getHistory();
        
        for(Media m: theHistory){
            for(Filterable f: m.getTheFilterAttributeList().listOfAttributes){
                tempList.add(f);
            }
        }
        
        if(theNavCntl.getTheMergedProfile().getHistory().size() > 0){
            for(Media m: theNavCntl.getTheMergedProfile().getHistory()){
               for(Filterable f: m.getTheFilterAttributeList().listOfAttributes){
                   tempList.add(f);
               }
            }
        }
        
        return tempList;
    }
    
    public void addToViewed(Recommendation theRec)
    {
        System.out.println("Viewed " + theRec.getMediaToRecommend().getTitle());
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        theRec.getMediaToRecommend().setDateViewedString(dateFormat.format(cal.getTime()));
        theNavCntl.getTheListOfUsers().getUserFromList(theNavCntl.getTheCurrentUser()).getProfile().getHistory().add(theRec.getMediaToRecommend());
    }
    
    //used to compare recommendations
    class MyRecommendationComp implements Comparator<Recommendation>{
 
        @Override
        public int compare(Recommendation o1, Recommendation o2) {
            if(o1.getStrength()< o2.getStrength()){
                return 1;
            } else {
                return -1;
            }
        }
    }
    
    
}
