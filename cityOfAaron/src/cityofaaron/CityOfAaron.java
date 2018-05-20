/*
 * The main() class file for the cityOfAaron Project
 * CIT-260
 * Spring 2018
 * Team Members: Gordon Pont, McKay Pingel, Mitchell Thomas
 */
package cityofaaron;

import byui.cit260.cityOfAaron.model.*;

/**
 *
 * @author Gordon/McKay/Mitchell
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create Player One
        Player playerOne = new Player();    
        playerOne.setName("Gordon Pont");      
        String playerOneName = playerOne.getName();       
        System.out.println(playerOne.toString());
        
        //Call to Actor One
        Actor.MemberOne.getName();
        Actor.MemberOne.getTitle();
        
        /*storing this as a variable.  Technically, we don't have to do this
         * because if we use toString, it will create the output automatically
         * but because the homework said to do this part, I am keeping it
         */
        String memberOneName = Actor.MemberOne.getName();
        String memberOneTitle = Actor.MemberOne.getTitle();
        
        System.out.println(Actor.MemberOne.toString());
        
        //validate ListItem Class created by Gordon
        
        ListItem pillow = new ListItem();
        
        pillow.setName("Comfy");
        pillow.setNumber(13);
        String pillowName = pillow.getName();
        int pillowNumber = pillow.getNumber();
        
        System.out.println(pillow.toString());
       
        
        //CropData Class by Mitchell
        CropData mainData = new CropData();
        mainData.setAcresOwned(0);
        mainData.setAcresPlanted(0);
        mainData.setCropYield(0);
        mainData.setEatenByRats(0);
        mainData.setHarvest(0);
        mainData.setHarvestAfterOffering(0);
        mainData.setNewPeople(0);
        mainData.setNumStarved(0);
        mainData.setNumberWhoDied(0);
        mainData.setOffering(0);
        mainData.setOfferingBushels(0);
        mainData.setPeopleFed(0);
        mainData.setPopulation(0);
        mainData.setWheatInStore(0);
        mainData.setWheatForPeople(0);
        int AcresOwned = mainData.getAcresOwned();
        int AcresPlanted = mainData.getAcresPlanted();
        int CropYield = mainData.getCropYield();
        int EatenByRats = mainData.getEatenByRats();
        int Harvest = mainData.getHarvest();
        int HarvestAfterOffering = mainData.getHarvestAfterOffering();
        int NewPeople = mainData.getNewPeople();
        int NumStarved = mainData.getNumStarved();
        int NumberWhoDied = mainData.getNumberWhoDied();
        int Offering = mainData.getOffering();
        int OfferingBushels = mainData.getOfferingBushels();
        int PeopleFed = mainData.getPeopleFed();
        int Population = mainData.getPopulation();
        int WheatInStore = mainData.getWheatInStore();
        int WheatForPeople = mainData.getWheatForPeople();
                                                        
        System.out.println(mainData.toString());
        
    }
    
}
