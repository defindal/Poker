
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Card;
import entity.Suit;
import java.util.List;

/**
 *
 * @author deph
 */
public class Ranker {

    private List<Card> cards;
<<<<<<< HEAD

    public Ranker(List<Card> cards) {
        if (cards.size() == 5) {
            this.cards = cards;
        }
    }

=======
    
    public Ranker(List<Card> cards){
        if(cards.size() == 5) {
            this.cards = cards;
        }
    }
    /**
     * cobaaaa
     */
    
>>>>>>> a9cb1e6b879cabc69ac790f26f1f8bdb4561d4b7
    /**
     *
     * @return kartu as
     */
<<<<<<< HEAD
    public boolean isOnePair() {

        return false;
=======
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
>>>>>>> a9cb1e6b879cabc69ac790f26f1f8bdb4561d4b7
    }

    public boolean isTwoPairs() {

        return false;
    }
<<<<<<< HEAD

    public boolean isThreeAKind() {

=======
    
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
>>>>>>> a9cb1e6b879cabc69ac790f26f1f8bdb4561d4b7
        return false;
    }

    public boolean isStraight() {
        return false;
    }

    public boolean isFlush() {
        boolean flush = true;
        for (int x = 0; x < 4; x++) {
            if (cards.get(x).getSuit() != cards.get(x + 1).getSuit()) {
                flush = false;
            }
        }
        return flush;
    }

    public boolean isFullHouse() {
        return false;
    }

    public boolean isFourOfAKind() {
        return false;
    }

    public boolean isStraighFlush() {
        return false;
    }

    public boolean isRoyalFlush() {
        return false;
    }
}
