// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Gordon Pont, McKay Pingel, Mitchell Thomas
// Date last modified: June 2018
//-------------------------------------------------------------
package byui.cit260.cityOfAaron.view;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import byui.cit260.cityOfAaron.model.*;
import byui.cit260.cityOfAaron.model.Player;
import byui.cit260.cityOfAaron.control.*;
/**
 *
 * @author humbl
 */
public class MainMenuView extends MenuView{
/**
* The displayMenuViewmethod
* Purpose: displays the menu, gets the user's input, and does the
* selected action
* Parameters: none
* Returns: none
*/
// =========================================================
    
     // Display the menu
    // Prompt the user and get the user’s input
    // Perform the desired action
    // Determine and display the next view
    
    Scanner keyboard = new Scanner(System.in);
    // Display the menu
    // Prompt the user and get the user’s input
    // Perform the desired action
    // Determine and display the next view
    
    Game myGame= new Game();   
   
    private String theMenu;
    private int max;
    
/**
* The MainMenuViewconstructor
* Purpose: Initialize the menu data
* Parameters: none
* Returns: none
*/
// ===================================
public MainMenuView()
{
    super("\n" +
    "**********************************\n" +
    "* CITY OF AARON: MAIN GAME MENU *\n" +
    "**********************************\n" +
    " 1 -Start new game\n" +
    " 2 -Get and start a saved game\n" +
    " 3 -Get help on playing the game\n" +
    " 4 -Save game\n" +
    " 5 -Quit\n",
    5);
}


/**
*The doActionmethod
* Purpose: performs the selected action
* Parameters: none
* Returns: none
*/
// ===================================
  @Override public void doAction(int option)
{
    switch (option)
    {
    case 1: // create and start a new game
        startNewGame();
        break;
    case 2: // get and start a saved game
        startSavedGame();
        break;
    case 3: // get help menu
        displayHelpMenuView();
        break;
    case 4: // save game
        displaySaveGameView();
        break;
        case 5:
    System.out.println("Thanks for playing ... goodbye.");
    }
}

/**
* The startNewGamemethod
* Purpose: creates game object and starts the game
* Parameters: none
* Returns: none
*/
// ===================================
public void startNewGame()
{
    // Show banner page
   System.out.println(
   "********************************************************\n" +
   "* Welcome to the City of Aaron. You have been summoned *\n" +
   "* by the High Priest to assume your role as ruler of *\n" +
   "* the city. Your responsibility is to buy land, sell *\n" +
   "* land, determine how much wheat to plant each year, *\n" +
   "* and how much to set aside to feed the people. You *\n" +
   "* will also be required to pay an annual tithe on the *\n" +
   "* that is harvested. If you fail to provide *\n" +
   "* enough wheat for the people to eat, people will die *\n" +
   "* and your workforce will be diminished. Plan very *\n" +
   "* carefully or you may find yourself in trouble with *\n" +
   "* the people. And oh, watch out for plagues and rats! *\n" +
   "********************************************************\n");  
   
   // Get player name, create player object, and save it in the Game
    String name;
    System.out.println("Please type in your first name: ");
    name = keyboard.next();
    // welcome message
    System.out.println("Welcome " + name + ", have fun playing.");
    // call the createNewGame( ) method. Pass the name as a parameter
    GameControl gc = new GameControl();
    gc.createNewGame(name);
    //show the game menu
    GameMenu gmv= new GameMenu();
    gmv.displayMenuView();
}

public void startSavedGame()
{
    System.out.println("Start saved game option selected.");
}

public void displayHelpMenuView()
{
        System.out.println("Display Help Menu option selected.");
}

public void displaySaveGameView() 
{
        System.out.println("Display Save Game option selected.");

}


}
