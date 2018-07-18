/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.control;

import byui.cit260.cityOfAaron.model.CropData;
import byui.cit260.cityOfAaron.exceptions.CropException;

import java.util.Random;


public class CropControl {
    
    private static Random random = new Random();
       
    public static int calcLandPrice() 
    {
        int landPrice = random.nextInt(11) + 17;
        return landPrice;
    }
    
public static int sellLand(int landPrice, int acresToSell, CropData cropData)
{
    int acresOwned = cropData.getAcresOwned();
    int wheatInStore = cropData.getWheatInStore();
    
    if (acresToSell <= 0) {
        System.out.println("That is not a positive Number");
        return -1;   
    }
    else if (acresToSell > acresOwned) {
        System.out.println("That is more land than you have");
        return -1;     
    }
    else {
       acresOwned -= acresToSell;
        cropData.setAcresOwned(acresOwned); 
        
        wheatInStore += acresToSell * landPrice;
        
       cropData.setWheatInStore(wheatInStore);
       
       return wheatInStore;
    }
}

public static void buyLand(int landToBuy, int price, CropData cropData) throws CropException {            


    //check parameters - do they meet the contract
    if(landToBuy < 0)
        throw new CropException("A negative value was input");
    int wheat = cropData.getWheatInStore();
    if(wheat < landToBuy * price) 
            throw new CropException("there is insufficient wheat to buy this much land");
       
    //add the number of acres to buy to the current number of acres
    int acresOwned = cropData.getAcresOwned();
    acresOwned += landToBuy;    
    cropData.setAcresOwned(acresOwned);
    
    //deduct cost from wheat in store
    wheat = cropData.getWheatInStore();
    wheat -= (landToBuy * price);
    cropData.setWheatInStore(wheat);
    
    
    
}
public static int plantCrops(int acresToPlant, CropData cropData) throws Exception {
        if (acresToPlant < 0) {
            throw new CropException("A negative value was input");
        }
       
        if (cropData.getAcresOwned() < acresToPlant) {
            throw new CropException("You don't have that many Acres of Land to plant on!");
        }
        
        if (cropData.getWheatInStore() < acresToPlant) {
            throw new CropException("You dont have enough Wheat to plant that many Acres!");
        }
        
        cropData.setWheatInStore(cropData.getWheatInStore() - acresToPlant);
        return cropData.getWheatInStore();
    }
   
public static void setOffering(int percentage, CropData cropData){
    
}
/**
*The feedPeople method
*Made by Gordon Pont 
*Purpose: to feed the people tending our land
* @param cropData
* @return wheatInStore
*/
//Feed People Method - Created by Gordon Pont
public static int feedPeople(int bushels ,CropData cropData) throws CropException
{    
    int wheatForPeople = cropData.getWheatForPeople();
    int wheatInStore = cropData.getWheatInStore();         
            
    if(wheatForPeople < 0) 
       throw new CropException("A negative value was input");
    if(wheatForPeople > wheatInStore) 
    {
        throw new CropException("Sorry, you don't have that much wheat");
    }  
        wheatInStore -= wheatForPeople;
        cropData.setWheatInStore(wheatInStore);
        return wheatInStore;
}

}
