/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.view;

import byui.cit260.cityOfAaron.model.Game;
import java.util.Scanner;

/**
 *
 * @author Mitchell
 */
public class GameMenu {
    Scanner keyboard = new Scanner(System.in);
    // Display the menu
    // Prompt the user and get the user’s input
    // Perform the desired action
    // Determine and display the next view
       
   
    private String theMenu;
    private int max;

public void GameMenuView()
{
    theMenu= "\n" +
    "**********************************\n" +
    "* CITY OF AARON: IN-GAME MENU *\n" +
    "**********************************\n" +
    " 1 -Sell Crops\n" +
    " 2 -Get Crop Information\n" +
    " 3 -Save Seeds\n" +
    " 4 -Save game\n" +
    " 5 -Quit\n";
    max = 5;
}
    public void displayMenuView() 
{
    int menuOption;
    do 
    {
        // Display the menu
        System.out.println(theMenu);
        // Prompt the user and get the user’s input
        menuOption= getMenuOption();
        // Perform the desired action
        doAction(menuOption);
        // Determine and display the next view
        
    } while(menuOption != max);   
}
    public int getMenuOption()
{
// declare a variable to hold user’s input
    int userInput;
// begin loop
do
{
    // get user input from the keyboard
    userInput= keyboard.nextInt();
    // if it is not a valid value, output an error message
    if (userInput< 1 || userInput> max)
    {
        System.out.println("Option must be between 1 and " + max);
    }
    // loop back to the top if input was not valid
    // return the value input by the user
    } while(userInput < 1 || userInput > max);
    //return the value input by the user
    return userInput;
}
    public void doAction(int option)
{
    switch (option)
    {
    case 1: // create and start a new game
        sellCrops();
        break;
    case 2: // get and start a saved game
        getCropInfo();
        break;
    case 3: // get help menu
        saveSeeds();
        break;
    case 4: // save game
        saveGame();
        break;
    case 5:
    System.out.println("Thanks for playing ... goodbye.");
    }
}
public void sellCrops(){
    System.out.println("The Sell Crops Method has been selected");
}
public void getCropInfo(){
    System.out.println("The Get Crop Info Method has been selected");
}
public void saveSeeds(){
    System.out.println("The Save Seeds Method has been selected");
}
public void saveGame(){
    System.out.println("The Save Game Method has been selected");
}
}

