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
