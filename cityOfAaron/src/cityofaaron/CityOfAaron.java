/*
 * The main() class file for the cityOfAaron Project
 * CIT-260
 * Spring 2018
 * Team Members: Gordon Pont, McKay Pingel, Mitchell Thomas
 */
package cityofaaron;

import byui.cit260.cityOfAaron.model.Player;
import byui.cit260.cityOfAaron.model.Actor;


/**
 *
 * @author Gordon/McKay/Mitchell
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create Player One
        Player playerOne = new Player();    
        playerOne.setName("Gordon Pont");      
        String playerOneName = playerOne.getName();       
        System.out.println(playerOne.toString());
        
        //Call to Actor One
        Actor.MemberOne.getName();
        Actor.MemberOne.getTitle();
        
        /*storing this as a variable.  Technically, we don't have to do this
         * because if we use toString, it will create the output automatically
         * but because the homework said to do this part, I am keeping it
         */
        String memberOneName = Actor.MemberOne.getName();
        String memberOneTitle = Actor.MemberOne.getTitle();
        
        System.out.println(Actor.MemberOne.toString());
        
    }
    
}
