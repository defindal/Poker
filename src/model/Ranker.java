
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Card;
import entity.Suit;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
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

    public boolean isOnePair(){
        int count=0;
        boolean check=true;
        for (int i = 0; i < cards.size() ; i++) {
            for (int j = i+1; j< cards.size(); j++) {
                if (cards.get(i).getLevel()==cards.get(j).getLevel()) {
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

    public boolean isTwoPairs() {

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

    public boolean isStraight() {
        List cards = new ArrayList();
        boolean isStraight = false;
        cards.add("1");
        cards.add("2");
        cards.add("3");
        cards.add("4");
        cards.add("5");
        
      for(int i = 0, j = i + 1; i < cards.size(); i++){
            int [] array = new int[cards.size()];
            array[i] = Integer.valueOf(cards.get(i).toString());
            Arrays.sort(array);
                for (int h=0; h<array.length; h++){
                    System.out.println(array[h]);
                }
                    if (array[j] == array[i] + 1)
                        System.out.println("y");
                        isStraight = true;
    }
        return false;
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
            int jumlahsama= 0;
            for (int j = 0; j < cards.size() ; j++) {
                if (cards.get(i).getLevel()==cards.get(j).getLevel()) {
                    jumlahsama ++;
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
        return false;
    }
}
