/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.io.*;

/**
 *
 * @author kristinakvasny
 */
public class PersistentDataCntl {
    private static PersistentDataCntl thePersistentDataCntl;
    private PersistentDataCollection thePersistentDataCollection;
    private final String External_Data_Path = "";
    private final String Data_File_Name = "AppData.ser";
    
    private PersistentDataCntl(){
        readSerializedDataCollection();
        if(thePersistentDataCollection == null){
            try{
                thePersistentDataCollection = new PersistentDataCollection();
                System.out.println("Had to create a new ser file");   
            } catch (Exception e){
                e.printStackTrace();
            }
            writeSerializedDataCollection();
            readSerializedDataCollection();
        }        
    }
    
    public static PersistentDataCntl getPersistentDataCntl(){
        if(thePersistentDataCntl == null){
            thePersistentDataCntl = new PersistentDataCntl();
        }      
        return thePersistentDataCntl;
    }
    
    public PersistentDataCollection getPeristentDataCollection(){
        return thePersistentDataCollection;
    }
    
    public void readSerializedDataCollection() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        String filePath = External_Data_Path + Data_File_Name;       
        try{
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            thePersistentDataCollection = (PersistentDataCollection) ois.readObject();
            ois.close();
        }
        catch(IOException | ClassNotFoundException ex){
            System.out.println("Ser file does not exist");
        }
     
    }
    
    public void writeSerializedDataCollection(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        String filePath = External_Data_Path + Data_File_Name;
        
        try{
            fos = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(thePersistentDataCollection);
            oos.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
