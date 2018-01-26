
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

    public Ranker(List<Card> cards) {
        if (cards.size() == 5) {
            this.cards = cards;
        }
    }

    /**
     *
     * @return kartu as
     */
    public boolean isOnePair() {

        return false;
    }

    public boolean isTwoPairs() {

        return false;
    }

    public boolean isThreeAKind() {

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
