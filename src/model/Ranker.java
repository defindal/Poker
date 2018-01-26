
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
        if(cards.size() == 5) {
            this.cards = cards;
        }
    }
    /**
     * cobaaaa
     */
    
    /**
     * 
     * @return kartu as
     */
    public boolean isOnePair(){
        int count=0;
        boolean check=true;
        for (int i = 0; i < cards.size() ; i++) {
            for (int j = i+1; j< cards.size(); j++) {
                if (cards.get(i)==cards.get(j)) {
                    count++;
                    
                    if(count > 1) return false;
                }
            }
            
        }
        if (count!=1) {
            check=false;
        }
        return check;
    }
    
    public boolean isTwoPairs(){
        
        return false;
    }
    
    public boolean isThreeAKind(){
        int count = 0;
        for (int i = 0; i < cards.size(); i++) {
            int a = cards.get(i).getLevel();
            int j = 0;
            while (j < cards.size()) {
                if (cards.get(j).getLevel() == a) {
                    count++;
                }
                j++;
            }
            if (count == 3) {
                return true;
            } else if (count == 2){
                return false;
            } else {
                count = 0;
            }
        }
        return false;
    }
    
    public boolean isStraight(){
        return false;
    }
    
    public boolean isFlush(){
        
        return false;
    }
     
      public boolean isFullHouse(){
        return false;
    }
    
    public boolean isFourOfAKind(){
        return false;
    }
    
    public boolean isStraighFlush(){
        return false;
    }
    
    public boolean isRoyalFlush(){
        return false;
    }
}
