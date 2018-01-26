/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author deph
 */
public class Card {

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }
    private Suit suit;
    private int level;
    
    public Card(Suit suit, int level){
        this.suit = suit;
        this.level = level;
    }
    
    public int getLevel() {
        return level;
    }

    public Suit getSuit() {
        return suit;
    }   
}
