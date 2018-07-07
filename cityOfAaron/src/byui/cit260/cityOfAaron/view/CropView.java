/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.view;
import byui.cit260.cityOfAaron.model.*;
import byui.cit260.cityOfAaron.control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import byui.cit260.cityOfAaron.exceptions.CropException;

/**
 * @author: Mitchell
 */
public class CropView {
    // Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);
    
    // Get references to the Game object and the CropData object
    private static Game theGame = CityOfAaron.getCurrentGame();
    private static CropData cropData = theGame.getCropData();
    
    /**
    * The buyLandView method
    * Purpose: interface with the user input for buying land * Parameters: none
    * Returns: none
    */
    public static void buyLandView() {
        // Get the cost of land for this round.
        int price = CropControl.calcLandPrice();
        // Prompt the user to enter the number of acres to buy
        System.out.format("You can buy land for %d bushels per acre.%n",price);

        // Get the user’s input and save it.
        int toBuy;
        boolean paramsNotOkay;
        // Call the buyLand() method in the control layer to buy the land
        do
        {
            paramsNotOkay = false;
            System.out.print("\nHow many acres of new land do you want to buy? ");
            toBuy = keyboard.nextInt();
        try
        {
           CropControl.buyLand(toBuy, price, cropData);
        }
        catch(CropException e)
        {
           System.out.println("I am sorry master, I cannot do this.");
           System.out.println(e.getMessage());
           paramsNotOkay = true;
        } 
        }while(paramsNotOkay);
    }
    
    public static void sellLandView() {
        // get the cost of land for this round
        int price = CropControl.calcLandPrice();
        
        // Prompt user to enter the number of acres to sell
        System.out.format("You can sell land for %d bushels per acre.%n",price);
        System.out.print("How many acres of new land do you want to sell? ");
        
        // Get the user’s input and save it.
        int toSell;
        toSell = keyboard.nextInt();
        
        // Call the sellLand() method in the control layer to sell the land
        CropControl.sellLand(price, toSell, cropData);
    }
    
    public static void feedPeopleView() {
        // Prompt user to enter how many bushels of grain to give to the people
        System.out.format("How many bushels of grain do you want to give to the people?%n ");
        
        // Get the user's input and save it.
        int bushels = keyboard.nextInt();
        
        // Call the feedPeople() method in the control layer 
        CropControl.feedPeople(bushels, cropData);
    }
    
    public static void plantCropsView() {
        // Prompt the user to input how many acres of land to plant
        System.out.format("How many acres of land do you want to plant?%n ");
        
        // Get the user's input and save it.
        int plantedCrops = keyboard.nextInt();
        
        // Call the plantCrops() method in the control layer
        CropControl.plantCrops(plantedCrops, cropData);
    }
    
    public static void setOfferingView() {
        // Prompt the user to input percentage of harvest to pay in offering
        System.out.format("What percentage of your harvest do you want to pay as an offering (0-100)?%n ");
        
        // Get the user's input and save it.
        int offeringPercentage = keyboard.nextInt();
        
        // Call the plantCrops() method in the control layer
        CropControl.setOffering(offeringPercentage, cropData);
    }
    
    /**
    * The runCropsView method()
    * Purpose: runs the CityOfAaron game
    * Parameters: none
    * Returns: none
    */
    public static void runCropsView() {
        // call the buyLandView() method
        buyLandView();
        // add calls to the other crop view methods
        // as they are written
    }
}
