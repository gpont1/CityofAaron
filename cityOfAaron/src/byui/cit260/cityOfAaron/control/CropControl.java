/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.control;

import byui.cit260.cityOfAaron.model.CropData;
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
}
