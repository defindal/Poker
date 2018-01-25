/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Card;
import java.util.List;

/**
 *
 * @author deph
 */
public class Ranker {
    private List<Card> cards;
    
    public Ranker(List<Card> cards){
        if(cards.size() == 5) this.cards = cards;
    }
    /*
        wuushhh
    */
    public boolean isOnePair(){
        
        return false;
    }
    
    /*
        wuushhh
    */
    public boolean isTwoPairs(){
        
        return false;
    }
    
    /*
        wuushhh
    */
    public boolean isThreeAKind(){
    
        return false;
    }
    
    /*
        wuushhh
    */
    public boolean isStraight(){
        return false;
    }
    
    /*
        wuushhh
    */
     public boolean isFlush(){
        return false;
    }
     
    /*
        wuushhh
    */
      public boolean isFullHouse(){
        return false;
    }
    
    /*
        wuushhh
    */
    public boolean isFourOfAKind(){
        return false;
    }
    
    /*
        wuushhh
    */
    public boolean isStraighFlush(){
        return false;
    }
    
    /*
        wuushhh
    */
    public boolean isRoyalFlush(){
        return false;
    }
    
    /*
        wuushhh
    */
}
