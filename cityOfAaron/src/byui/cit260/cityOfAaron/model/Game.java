/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Gordon/McKay/Mitchell
 */
public class Game implements Serializable {
private Player thePlayer;
    private CropData cropData = null;
    private Map theMap;

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }
    
    /**
     * the getCrops()method
     * Purpose: get a reference to the crop object
     * Parameters: none
     * Returns: a reference to a crop object
     */
    public CropData getCropData() {
        return cropData;
    }
    /**
     * the setCrops()method
     * Purpose: store a reference to a crop object
     * Parameters: a reference to a crop object
     * Returns: none
     */
    public void setCropData(CropData cropRef) {
        cropData = cropRef;
    }
    
    public Map getMap() {
        return this.theMap;
    }
    
    public void setMap(Map map) {
        theMap = map;
    }
}