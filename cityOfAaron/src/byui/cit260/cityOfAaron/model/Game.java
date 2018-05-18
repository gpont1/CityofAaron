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
    
    //Declare private variables
    private String thePlayer;
    private Player player;
    
    public Game() {
    }

    public String getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(String thePlayer) {
        this.thePlayer = thePlayer;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.thePlayer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        return true;    
    }

    @Override
    public String toString() {
        return "Game{" + "thePlayer=" + thePlayer + '}';
    }
   
}
    
  
