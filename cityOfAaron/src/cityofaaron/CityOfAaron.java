/*
 * The main() class file for the cityOfAaron Project
 * CIT-260
 * Spring 2018
 * Team Members: Gordon Pont, McKay Pingel, Mitchell Thomas
 */
package cityofaaron;

import byui.cit260.cityOfAaron.view.MainMenuView;
import byui.cit260.cityOfAaron.model.*;
import byui.cit260.cityOfAaron.control.*;
import byui.cit260.cityOfAaron.view.*;

// The City of Aaron Game
// The driver file, contains the main() method
// Author: Gordon,McKay,Mitchell
// Date last modified: June 2018
//-------------------------------------------------------------

public class CityOfAaron {
    /**
     * @param args the command line arguments
     */
    
    //variable for keeping a reference to the Game Object
    private static Game theGame = null;

    public static Game getCurrentGame() {
        return theGame;
    }

    public static void setCurrentGame(Game theGame) {
        CityOfAaron.theGame = theGame;
    }
    
    //Test for sellLand Method
    public static void testSellLand()
    {
        System.out.println("sellLand Test");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(2800);
        int toSell = 10;
        int price = 15;
        int expResult = 2790;
        int result = CropControl.sellLand(price, toSell, theCrops);
        
        System.out.println("Bushels of wheat owned after sale: " + result);
        //assertEquals(expResult, result);
    }
    
    //Feed People Test - Method Created by Gordon Pont
    public static void testFeedPeople() 
    {       
        System.out.println("feedPeople Test");
        CropData feedCrops = new CropData();
        feedCrops.setWheatForPeople(1000);
        feedCrops.setWheatInStore(5000);
        
        int result = CropControl.feedPeople(feedCrops);
        
        System.out.println("You have: " + result + " bushel(s) left in the stores");
    }
    
    // main function -entry point for the program
    // runs the main menu
    public static void main(String[] args) {

        //Week 7 Stuff
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();
        
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
        
        Location home = new Location();
        home.setDescription("Location has home");
        home.setSymbol("House");
        
        String homeDescription = home.getDescription();
        String homeSymbol = home.getSymbol();
        
        System.out.println(home.toString());
        
        testSellLand();
        testFeedPeople();
    }
    
    
}
