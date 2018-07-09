/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.view;
import byui.cit260.cityOfAaron.view.*;
import byui.cit260.cityOfAaron.control.*;

/**
 *
 * @author awesome
 */
public class ListMenuView extends MenuView {
    ListMenuView() {
        super("\n" +
                "**********************************\n" +
                "* CITY OF AARON: LIST MENU *\n" +
                "**********************************\n" +
                " 1 - View the animals in the storehouse\n" +
                " 2 - View the tools in the storehouse\n" +
                " 3 - View the provisions in the storehouse\n" +
                " 5 - View authors of this game\n" +
                " 6 - Back to the Game Menu?\n",
            5);
    }
    
    @Override public void doAction(int option) {
            switch (option) {
                case 1: // if the option is 1, call startNewGame( )
                    listAnimals();
                    break;
                case 2: // if the option is 2, call startExistingGame( )
                    listTools();
                    break;
                case 3: // if the option is 3, call displayHelpMenu( )
                    listProvisions();
                    break;
                case 4: // if the option is 4, call displaySaveGame( )
                    listTeam();
                    break;
                case 5:
                    break;   
            }
        }
    
    public void listAnimals() {
        GameControl.createAnimalList();
    }
    
    public void listTools() {
        GameControl.createToolsList();
    }
    
    public void listProvisions() {
        System.out.println("listProvisions");
    }
    
    public void listTeam() {
        System.out.println("listTeam");
    }
}
