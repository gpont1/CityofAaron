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
        theGame = new Game();
        CityOfAaron.setCurrentGame(theGame);
        // create the player object. Save it in the game object
            Player thePlayer = new Player();
            thePlayer.setName(name);
            theGame.setThePlayer(thePlayer); 
            createMap();
            createCropDataObject();
             
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
            theCrops.setWheatInStore(1500);
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
            Map theMap = new Map(MAX_ROW, MAX_COL);
            
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
            theMap.setLocation(i, 3, loc);
            }
            // define the string for a farm land location
            String farmland = "You are on the fertile banks of the River.\n" +
            "In the spring, this low farmland floods and is covered with rich\n" +
            "new soil. Wheat is planted as far as you can see.";
            // set a farmland location with a hint
            loc = new Location();
            loc.setDescription(farmland + "\nOnebushel will plant two acres of wheat.");
            loc.setSymbol("!!!");
            
            for(int i=0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 2, loc);
            theMap.setLocation(i, 4, loc);
            
            }
            
            //Create Forest 
            String forest = "You are in a forest on the edge of town.\n" + 
                    "Be careful of any Lamanites you see around,\n" + 
                    "They can be VERY unpredictable";
            loc = new Location();
            loc.setDescription(forest);
            loc.setSymbol("^^^");
            
            for(int i=0; i <= 2; i++) {
                for(int j = 0; j <= 1; j++) {
                    theMap.setLocation(i, j, loc);
                    }
            }
            
            //Create the City of Aaron
            String town = "You are inside the City of Aaron.\n" + 
                    "You are overwhelmed by the number of people\n" + 
                    "that are shopping and frolicking about";
            loc = new Location();
            loc.setSymbol("|||");
            loc.setDescription(town);
             for( int i=0; i <= 1 ; i++){
                 theMap.setLocation(3, i, loc);
                 theMap.setLocation(4, i, loc);
                }
            theGame.setMap(theMap);
            
        }
            
        
        
        public static void displayMap()
        {
            //for(int row = 0; row <= MAX_ROW; row++){ 
            //for(int col = 0; col <= MAX_COL; col++) 
            //{
            Map theMap = theGame.getMap();
            for(int i = 0; i < MAX_COL; i++){
                System.out.println("\n");
                for(int j = 0; j < MAX_ROW; j++){
                    Location location = theMap.getLocation(i,j);
                    String symbol = location.getSymbol();
                    System.out.print(symbol + " ");
                }
            }
        }    
        public static void createToolsList(){
            ArrayList<ListItem> toolsList = new ArrayList<>();
            ListItem pickaxe = new ListItem();
            pickaxe.setName("Pickaxe");
            pickaxe.setNumber(1);
            toolsList.add(pickaxe);
            ListItem sickle = new ListItem();
            sickle.setName("Sickle");
            sickle.setNumber(1);
            toolsList.add(sickle);
            ListItem hoe = new ListItem();
            hoe.setName("Hoe");
            hoe.setNumber(1);
            toolsList.add(hoe);
            toolsList.forEach((tools) -> {
                System.out.println(tools.toString());
        });
        
        
        }
        /* 
        public static void createAnimalList()
        {
            ArrayList<ListItem> animals = new ArrayList<ListItem>();
            animals.add(new ListItem("cows", 12));
            animals.add(new ListItem("horses", 3));
            animals.add(new ListItem("pigs", 7));
            animals.add(new ListItem("goats", 4));
            // Save the animals in the game
            theGame.setAnimals(animals);
        }
    */
public static void createAnimalList()
        {
            ArrayList<ListItem> animals = new ArrayList<>();
            ListItem dog = new ListItem();
            dog.setName("Dog");
            dog.setNumber(10);
            animals.add(dog);
            
            ListItem cow = new ListItem();
            cow.setName("Cow");
            cow.setNumber(13);
            animals.add(cow);
            
            ListItem horse = new ListItem();
            cow.setName("Horse");
            cow.setNumber(2);
            animals.add(horse);
            
            theGame.setAnimals(animals);
        }   
    } 
    }

