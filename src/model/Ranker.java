
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
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;

/*
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
    /*
     * 
     * isOnePair merupakan menentukan sepasang kartu yang sama. Method isOnePair memerlukan variabel count untuk mengukur pasang kartu yang sama.
     * Kartu akan dibandingkan menggunakan perulangan. Variabel count akan bertambah jika ada kartu yang sama. 
     * Jika variabel count lebih dari 1 maka return false dan perulangan dihentikan. Jika count sama dengan 0 maka return akan false.
     * By Ryan
     */
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

    /*
    by @april nf
<<<<<<< HEAD
    Method isTwoPairs untuk membaca kartu apakah termasuk kategori Two pairs yaitu
    kartu yang mempunyai dua pasang sama 
     */
      
=======
    */
    
>>>>>>> 2fdc2498096440f42985f3ad258d440b4ba3d29a
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
    /**
     * Method untuk return true jika list kartu yang memiliki tiga kartu dengan level yang sama
     * @return true or false
     */
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
    //damar
    public boolean isStraight() {
        boolean isStraight = false;
        int array[] = new int[5];
        int count = 0;
        
        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.valueOf(cards.get(j).toString());
        }
        Arrays.sort(array);
        for (int j = 0; j < array.length; j++) {
            if (array[j] == 14 && array[0] == 2) {
                array[j] = 1;
            }
        }
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != array[j]) { //angka harus beda
                    if (array[j] == (array[i]) + 1) {
                        count++;
                        if (count < 4) {
                            isStraight = false;
                            System.out.println(isStraight);
                        } else {
                            isStraight = true;
                            System.out.println(isStraight);
                        }
                    }
                }
            }

        }
        return isStraight;
    }
 
    /**
<<<<<<< HEAD
     * isFlush Yusuf Hanafi Angkat
=======
     * isFlush -> Menentukan apakah semua kartu bergambar sama.
     * Yusuf Hanafi Angkat
>>>>>>> 2fdc2498096440f42985f3ad258d440b4ba3d29a
     */
    public boolean isFlush() {
        boolean flush = true;
        for (int x = 0; x < 4; x++) {
            if (cards.get(x).getSuit() != cards.get(x + 1).getSuit()) {
                return false;
            }
        }
        return flush;
    }
    
    //Natan
    public boolean isFullHouse() {
        boolean fullhouse = true;
        int count=0;
        int[] notcount = new int[5];
        int j = 0;
        int m=0;
        for (int i = 0; i < cards.size(); i++)
        {
            int a = cards.get(i).getLevel();
            while (j < cards.size()) {
                if (cards.get(j).getLevel() == a) {
                    count++;
                } else {
                    notcount[m] = cards.get(j).getLevel();
                    m++;
                }
                j++;
        }
        if (count == 3) 
        {
            if (notcount[0] == notcount[1]) 
            {
                return fullhouse;
            }
        }   
    }return false;
}
    /**
     * method fourofkind akan menghasilkan nilai True dan False
     * method ini akan mengeluarkan nilai True Jika 4 dari total semua kartu (5) sama level.
     * @return True
     * method ini akan mengeluarkan nilai False . Jika tidak memenuhi syarat .
     *
     * by: Sigit Yudhianto
     */
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

    //Muhammad Donny Setya
    /**
    * Method ini untuk mendapatkan nilai Straight Flush
    * Method ini berhubungan dengan method isStraight dan isFlush
    * Method ini kebalikan dari method isRoyalFlush
    */
    public boolean isStraighFlush() {
        if(isStraight() && isFlush()){
            int i = 0;
            int j = 0;
            while(i < cards.size()){
                if(cards.get(i).getLevel() == 13){
                    while(j < cards.size()){
                        if(cards.get(j).getLevel() == 14){
                           return false; 
                        }
                     j++;   
                    }return true;
                }
                i++;
            }return true;
        }
        return false;   
    }
    
    //Donny Salman
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
