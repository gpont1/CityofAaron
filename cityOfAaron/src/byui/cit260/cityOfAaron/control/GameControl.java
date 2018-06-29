/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.control;

import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import byui.cit260.cityOfAaron.model.*;

/**
 *
 * @author humbl
 */
public class GameControl {
    
    // size of the Locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    // reference to a Game object
    private static Game theGame;
    
    public static void createNewGame(String name)
    {
        // Created the game object. Save it in the maindriver file
        theGame= new Game();
        CityOfAaron.setCurrentGame(theGame);
        // create the player object. Save it in the game object
        Player thePlayer= new Player();
        thePlayer.setName(name);
        theGame.setPlayer(thePlayer);
        
        
        
    }

        public static void createCropDataObject()
        {
            // create the CropDataobject
            CropData theCrops= new CropData();
            theCrops.setYear(0);
            theCrops.setPopulation(100);
            theCrops.setNewPeople(5);
            theCrops.setCropYield(3);
            theCrops.setNumberWhoDied(0);
            theCrops.setOffering(10);
            theCrops.setWheatInStore(2700);
            theCrops.setAcresOwned(1000);
            theCrops.setAcresPlanted(1000);
            theCrops.setHarvest(3000);
            theCrops.setOfferingBushels(300);
            theCrops.setAcresPlanted(1000);
            // Save the cropDatain the Game object
            theGame.setCropData(theCrops);
            // create the list of animals
            // create the list of tools
            //create the list of provisions
            // create the Locations and the Map object
        }
    
        /**
        * The createMapmethod
        * Purpose: creates the location objects and the map
        * Parameters: none
        * Returns: none
        */
        public static void createMap()
        {
            // create the Map object,
            // refer to the Map constructor
            Map theMap= new Map(MAX_ROW, MAX_COL);
            
            // create a string that will go in the Location objects
            // that contain the river
            String river = "You are on the River. The river is the source\n" +
            "of life for our city. The river marks the eastern\n " +
            "boundary of the city -it is wilderness to the East.\n";
            // create a new Location object
            Location loc= new Location();
            // use setters in the Location class to set the description and symbol
            loc.setDescription(river);
            loc.setSymbol("~~~");
            // set this location object in each cell of the array in column 4
            for(int i= 0; i< MAX_ROW; i++)
            {
            theMap.setLocation(i, 4, loc);
            
            // define the string for a farm land location
            String farmland = "You are on the fertile banks of the River.\n" +
            "In the spring, this low farmland floods and is covered with rich\n" +
            "new soil. Wheat is planted as far as you can see.";
            // set a farmland location with a hint
            loc = new Location();
            loc.setDescription(farmland + "\nOnebushel will plant two acres of wheat.");
            loc.setSymbol("!!!");
            
            for(i=0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 3, loc);
            theMap.setLocation(i, 5, loc);
            }
            
            //Create Forest 
            String forest = "You are in a forest on the edge of town.\n" + 
                    "Be careful of any Lamanites you see around,\n" + 
                    "They can be VERY unpredictable";
            loc = new Location();
            loc.setSymbol("^^^");
            
            for(i=0; i < 2; i++) {
                for(int j=0; j< 2; j++) {
                    theMap.setLocation(i, j, loc);
                }
            }
            
            //Create the City of Aaron
            String town = "You are inside the City of Aaron.\n" + 
                    "You are overwhelmed by the number of people\n" + 
                    "that are shopping and frolicking about";
            loc = new Location();
            loc.setSymbol("[][][]");
             for(i=0; i> 2 && i < MAX_ROW; i++) 
                for(int j=0; j< 2 ; j++) 
                    theMap.setLocation(i, j, loc);
               
        }
            theGame.setMap(theMap);
        }
        
        public static void displayMap()
        {
            Map map = new Map();
            Location loc = new Location();
                       
            for(int i = 0; i < MAX_ROW; i++) 
                for(int j = 0; j < MAX_COL; j++) {
                    map.setLocation(i,j, loc);
                    System.out.println(loc.getSymbol());
                }
        }
        
        public static void createAnimalList()
        {
            ArrayList<ListItem> animals = new ArrayList<ListItem>();
            animals.add(new ListItem("dog", 12));
            animals.add(new ListItem("chicken", 3));
            animals.add(new ListItem("cow", 7));
            animals.add(new ListItem("horse", 4));
            // Save the animals in the game
            theGame.setAnimals(animals);
        }
    }
