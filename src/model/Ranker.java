
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Card;
import entity.Suit;
import java.util.ArrayList;
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
    // Ryan
    public boolean isOnePair() {
        int count = 0;
        boolean check = true;
        for (int i = 0; i < cards.size(); i++) {
            for (int j = i + 1; j < cards.size(); j++) {
                if (cards.get(i).getLevel() == cards.get(j).getLevel()) {
                    count++;

                    if (count > 1) {
                        return false;
                    }
                }
            }

        }
        if (count != 1) {
            check = false;
        }
        return check;
    }

    public boolean isTwoPairs() {
        boolean isTwoPairs = false;
        int counter = 0;
        for (int i = 0, j = i + 1; i < cards.size(); i++) {
            if (cards.get(i).getLevel() == cards.get(j).getLevel()) {
                counter++;
                if (counter > 2 || counter < 2) {
                    isTwoPairs = false;
                } else {
                    isTwoPairs = true;
                }
            }
        }
        return isTwoPairs;
    }

    public boolean isThreeAKind() {
        List<Integer> ls = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < cards.size(); i++) {
            int a = cards.get(i).getLevel();
            int j = 0;
            int k = 0;
            while (j < cards.size()) {
                if (cards.get(j).getLevel() == a) {
                    count++;
                } else {
                    ls.add(k, cards.get(j).getLevel());
                    k++;
                }
                j++;
            }
            if (count == 3) {
                if (ls.get(0) == ls.get(1)) {
                    return false;
                } else {
                    return true;
                }
            } else if (count == 2) {
                return false;
            } else {
                count = 0;
                ls.removeAll(ls);
            }
        }
        return false;
    }

    public boolean isStraight() {
        return true;
    }

    public boolean isFlush() {
        boolean flush = true;
        for (int x = 0; x < 4; x++) {
            if (cards.get(x).getSuit() != cards.get(x + 1).getSuit()) {
                return false;
            }
        }
        return flush;
    }

    public boolean isFullHouse() {
        return false;
    }

    public boolean isFourOfAKind() {
        for (int i = 0; i < cards.size(); i++) {
            int jumlahsama = 0;
            for (int j = 0; j < cards.size(); j++) {
                if (cards.get(i).getLevel() == cards.get(j).getLevel()) {
                    jumlahsama++;
                }
            }
            if (jumlahsama == 4) {
                return true;
            }
        }
        return false;
    }

    public boolean isStraighFlush() {
        return false;
    }

    public boolean isRoyalFlush() {
        if (isFlush()&&isStraight()) {
            int i = 0;
            int j = 0;
            while (i < cards.size()) {
                if (cards.get(i).getLevel() == 13) {
                    while (j < cards.size()) {
                        if (cards.get(j).getLevel() == 14) {
                            return true;
                        }
                        j++;
                    } return false;
                }
                i++;
            }
            return false;
        }
        return false;
    }
}
