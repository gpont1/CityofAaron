/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.view;

import byui.cit260.cityOfAaron.control.GameControl;
import byui.cit260.cityOfAaron.control.CropControl;
import byui.cit260.cityOfAaron.view.CropView;

import byui.cit260.cityOfAaron.view.CropView;

/**
 *
 * @author Mitchell
 */
public class GameMenu extends MenuView{
    public GameMenu() {
        super("\n" +
            "**********************************\n" +
            "* CITY OF AARON: NEW GAME MENU *\n" +
            "**********************************\n" +
            " 1 - View the map\n" +
            " 2 - View/Print a list\n" +
            " 3 - Move to a new location\n" +
            " 4 - Manage the Crops\n" +
            " 5 - Feed your workers\n" +
            " 6 - Return to the Main Menu\n",
        5);
        }
   
   @Override public void doAction(int option) {
        switch (option) {
        case 1: // if the option is 1, call startNewGame( )
            viewMap();
            break;
        case 2: // if the option is 2, call startExistingGame( )
            viewList();
            break;
        case 3: // if the option is 3, call displayHelpMenu( )
            moveToNewLocation();
            break;
        case 4: // if the option is 4, call displaySaveGame( )
            manageCrops();
            break;
        case 5: //if the option is 5, call the feedPeopleView() method
            CropView.feedPeopleView();
            break;
        case 6:
            break;
        }  
   }
   
    public void viewMap() {
        GameControl.displayMap();
        
     
    }
    
    public void viewList() {
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenu();
    }
    
    public void moveToNewLocation() {
        System.out.println("moveToNewLocation");
    }
    
    public void manageCrops() {
        CropView.buyLandView();
    }
}