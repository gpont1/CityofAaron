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
    //Create a new Game object.
    Game theGame = new Game();
    
    // Save a reference to it in the GameProjectclass.
    CityOfAaron.setCurrentGame(theGame);
    // Display the Banner Page.
    System.out.println("Welcome to the city of Aaron.");
    // Create a new Player object
    Player thePlayer= new Player();
    // Prompt for and get the user’s name.
    String name;
    System.out.println("Please type in your first name: ");
    name = keyboard.next();
    
    // Save the user’s name in the Player object
        thePlayer.setName(name);
    // Save a reference to the player object in the Game object
    theGame.setPlayer(thePlayer); 
    
    // Display a welcome message
    System.out.println("Welcome "+ name + " have fun.");
    
    // Display the Game menu
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
