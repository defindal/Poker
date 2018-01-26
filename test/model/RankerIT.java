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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deph
 */
public class RankerIT {

    public RankerIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of isOnePair method, of class Ranker.
     */
    @org.junit.Test
    public void testIsOnePair() {
        System.out.println("isOnePair");
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.CLUBS, 10));
        cards.add(new Card(Suit.DIAMOND, 10));
        cards.add(new Card(Suit.SPADES, 1));
        cards.add(new Card(Suit.HEARTS, 11));
        cards.add(new Card(Suit.CLUBS, 7));

        Ranker instance = new Ranker(cards);
        assertTrue(instance.isOnePair());

    }

    public void testIsOnePairFalse1() {
        System.out.println("isNotOnePair");
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.CLUBS, 10));
        cards.add(new Card(Suit.DIAMOND, 10));
        cards.add(new Card(Suit.SPADES, 10));
        cards.add(new Card(Suit.HEARTS, 11));
        cards.add(new Card(Suit.CLUBS, 7));

        Ranker instance = new Ranker(cards);
        assertTrue(instance.isOnePair());


        System.out.println("isNotOnePair");
        List<Card> cards2 = new ArrayList<Card>();
        cards2.add(new Card(Suit.CLUBS,10));
        cards2.add(new Card(Suit.DIAMOND,10));
        cards2.add(new Card(Suit.SPADES,10));
        cards2.add(new Card(Suit.HEARTS,11));
        cards2.add(new Card(Suit.CLUBS,10));
        
        Ranker instance2 = new Ranker(cards2);
        assertFalse(instance2.isOnePair());
        
        System.out.println("isNotOnePair");
        List<Card> cards3 = new ArrayList<Card>();
        cards3.add(new Card(Suit.CLUBS,10));
        cards3.add(new Card(Suit.DIAMOND,10));
        cards3.add(new Card(Suit.SPADES,1));
        cards3.add(new Card(Suit.HEARTS,11));
        cards3.add(new Card(Suit.CLUBS,10));
        
        Ranker instance3 = new Ranker(cards3);
        assertFalse(instance3.isOnePair());
        
    }
    

    /**
     * Test of isTwoPairs method, of class Ranker.
     */
    @org.junit.Test
    public void testIsTwoPairs() {
        System.out.println("isTwoPairs(Case True)");
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.DIAMOND, 10));
        cards.add(new Card(Suit.HEARTS, 7));
        cards.add(new Card(Suit.SPADES, 8));
        cards.add(new Card(Suit.HEARTS, 8));
        cards.add(new Card(Suit.CLUBS, 7));

        Ranker instancetwopairs = new Ranker(cards);
        assertTrue(instancetwopairs.isTwoPairs());

        List<Card> cards2 = new ArrayList<Card>();
        System.out.println("isTwoPairs (Case False 1)");
<<<<<<< HEAD
        cards2.add(new Card(Suit.DIAMOND, 7));
        cards2.add(new Card(Suit.SPADES, 7));
        cards2.add(new Card(Suit.HEARTS, 8));
        cards2.add(new Card(Suit.CLUBS, 8));
        cards2.add(new Card(Suit.HEARTS, 7));
        Ranker instance2 = new Ranker(cards2);
        assertFalse(instance2.isTwoPairs());
        
        List<Card> cards3 = new ArrayList<Card>();
        System.out.println("isTwoPairs (Case False 2)");
        cards3.add(new Card(Suit.CLUBS, 1));
        cards3.add(new Card(Suit.HEARTS, 4));
        cards3.add(new Card(Suit.DIAMOND, 6));
        cards3.add(new Card(Suit.DIAMOND, 4));
        cards3.add(new Card(Suit.SPADES, 4));
        Ranker instance3 = new Ranker(cards3);
        assertFalse(instance3.isTwoPairs());
        
        List<Card> cards4 = new ArrayList<Card>();
        System.out.println("isTwoPairs (Case False 3)");
        cards4.add(new Card(Suit.HEARTS, 1));
        cards4.add(new Card(Suit.HEARTS, 5));
        cards4.add(new Card(Suit.HEARTS, 3));
        cards4.add(new Card(Suit.HEARTS, 4));
        cards4.add(new Card(Suit.HEARTS, 2));
        Ranker instance4 = new Ranker(cards4);
        assertFalse(instance4.isTwoPairs());
=======
        cards.add(new Card(Suit.DIAMOND, 7));
        cards.add(new Card(Suit.SPADES, 7));
        cards.add(new Card(Suit.HEARTS, 8));
        cards.add(new Card(Suit.CLUBS, 8));
        cards.add(new Card(Suit.HEARTS, 7));

        assertFalse(instancetwopairs.isTwoPairs());

        System.out.println("isTwoPairs (Case False 2)");
        cards.add(new Card(Suit.CLUBS, 1));
        cards.add(new Card(Suit.HEARTS, 4));
        cards.add(new Card(Suit.DIAMOND, 6));
        cards.add(new Card(Suit.DIAMOND, 2));
        cards.add(new Card(Suit.SPADES, 4));

        assertFalse(instancetwopairs.isTwoPairs());

        System.out.println("isTwoPairs (Case False 3)");
        cards.add(new Card(Suit.HEARTS, 1));
        cards.add(new Card(Suit.HEARTS, 5));
        cards.add(new Card(Suit.HEARTS, 3));
        cards.add(new Card(Suit.HEARTS, 4));
        cards.add(new Card(Suit.HEARTS, 2));

        assertFalse(instancetwopairs.isTwoPairs());
>>>>>>> 2fdc2498096440f42985f3ad258d440b4ba3d29a
    }

    /**
     * Test of isThreeAKind method untuk test jika card memiliki value tiga kartu dengan level yang sama, of class Ranker.
     */
    @org.junit.Test
    public void testIsThreeAKind() {
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.CLUBS,11));
        cards.add(new Card(Suit.DIAMOND,11));
        cards.add(new Card(Suit.SPADES,11));
<<<<<<< HEAD
        cards.add(new Card(Suit.HEARTS,3));
        cards.add(new Card(Suit.SPADES,3));
        assertTrue(instance.isThreeAKind());
//        boolean expResult = false;
//        boolean result = instance.isThreeAKind();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.

//        fail("The test case is a prototype.");
=======
        cards.add(new Card(Suit.HEARTS,6));
        cards.add(new Card(Suit.SPADES,1));
        Ranker instance3kindt = new Ranker(cards);
        assertTrue(instance3kindt.isThreeAKind());
    }
    
    /**
     * Test of isThreeAKind method untuk test jika card memiliki value tiga kartu dengan level yang sama dikombinasikan dengan dua kartu dengan level yang sama, of class Ranker.
     */
    @org.junit.Test
    public void testIsThreeAKindFalse1() {       
        List<Card> cards1 = new ArrayList<Card>();
        cards1.add(new Card(Suit.CLUBS,3));
        cards1.add(new Card(Suit.DIAMOND,6));
        cards1.add(new Card(Suit.SPADES,3));
        cards1.add(new Card(Suit.HEARTS,6));
        cards1.add(new Card(Suit.DIAMOND,3));
        Ranker instance3kindf = new Ranker(cards1);
        assertFalse(instance3kindf.isThreeAKind());
    }
    
    /**
     * Test of isThreeAKind method untuk test jika card tidak memiliki value tiga kartu dengan level yang sama, of class Ranker.
     */
    @org.junit.Test
    public void testIsThreeAKindFalse2() {
        System.out.println("isThreeAKind");
        List<Card> cards2 = new ArrayList<Card>();
        cards2.add(new Card(Suit.CLUBS,5));
        cards2.add(new Card(Suit.DIAMOND,2));
        cards2.add(new Card(Suit.SPADES,13));
        cards2.add(new Card(Suit.HEARTS,13));
        cards2.add(new Card(Suit.DIAMOND,10));
        Ranker instance3kindf2 = new Ranker(cards2);
        assertFalse(instance3kindf2.isThreeAKind());
>>>>>>> 2fdc2498096440f42985f3ad258d440b4ba3d29a
    }

    /**
     * Test of isStraight method, of class Ranker.
     */
    @org.junit.Test
    public void testIsStraight() {
        System.out.println("isStraight");
<<<<<<< HEAD
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.HEARTS,1));
        cards.add(new Card(Suit.HEARTS,2));
        cards.add(new Card(Suit.SPADES,3));
        cards.add(new Card(Suit.HEARTS,4));
        cards.add(new Card(Suit.DIAMOND,5));
        Ranker instance3 = new Ranker(cards);
        assertTrue(instance3.isStraight());
=======
        Ranker instance = null;
        boolean expResult = false;
        boolean result = instance.isStraight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
>>>>>>> 2fdc2498096440f42985f3ad258d440b4ba3d29a
    }

    /**
     * Test of isFlush method, of class Ranker.
     * Yusuf Hanafi Angkat
     */
    @org.junit.Test
    public void testIsFlush() {
        //Test Benar : Semua kartu bergambar sama.
        System.out.println("isFlush 1 : Benar (assertTrue)");
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.HEARTS, 10));
        cards.add(new Card(Suit.HEARTS, 7));
        cards.add(new Card(Suit.HEARTS, 8));
        cards.add(new Card(Suit.HEARTS, 5));
        cards.add(new Card(Suit.HEARTS, 7));
        Ranker instance = new Ranker(cards);
        assertTrue(instance.isFlush());
        //Test Salah : 1 kartu bergambar berbeda.        
        System.out.println("isFlush 2 : Salah (assertFalse)");
        List<Card> cards2 = new ArrayList<Card>();
        cards2.add(new Card(Suit.DIAMOND,10));
        cards2.add(new Card(Suit.HEARTS,7));
        cards2.add(new Card(Suit.HEARTS,8));
        cards2.add(new Card(Suit.HEARTS,5));
        cards2.add(new Card(Suit.HEARTS,7));
        Ranker instance2 = new Ranker(cards2);
        assertFalse(instance2.isFlush());
        //Test Salah : Kartu bergambar berbeda.
        System.out.println("isFlush 3 : Salah (assertFalse)");
        List<Card> cards3 = new ArrayList<Card>();
        cards3.add(new Card(Suit.HEARTS,10));
        cards3.add(new Card(Suit.HEARTS,7));
        cards3.add(new Card(Suit.SPADES,8));
        cards3.add(new Card(Suit.HEARTS,5));
        cards3.add(new Card(Suit.DIAMOND,7));
        Ranker instance3 = new Ranker(cards3);
        assertFalse(instance3.isFlush());
    }

    /**
     * Test of isFullHouse method, of class Ranker.
     */
    @org.junit.Test
    public void testIsFullHouse() {
        System.out.println("isFullHouse");
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.HEARTS,10));
        cards.add(new Card(Suit.CLUBS,10));
        cards.add(new Card(Suit.SPADES,10));
        cards.add(new Card(Suit.HEARTS,7));
        cards.add(new Card(Suit.DIAMOND,7));
        
        Ranker instFH = new Ranker(cards);
        assertTrue(instFH.isFullHouse());
    }
    
     @org.junit.Test
    public void testIsFullHouseFalse1() {
        System.out.println("isNotFullHouse");
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.HEARTS,10));
        cards.add(new Card(Suit.CLUBS,10));
        cards.add(new Card(Suit.SPADES,10));
        cards.add(new Card(Suit.HEARTS,8));
        cards.add(new Card(Suit.DIAMOND,7));
        
        Ranker instFHfalse1 = new Ranker(cards);
        assertFalse(instFHfalse1.isFullHouse());
    }
    
     @org.junit.Test
    public void testIsFullHouseFalse2() {
        System.out.println("isFullHouse");
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.HEARTS,10));
        cards.add(new Card(Suit.CLUBS,9));
        cards.add(new Card(Suit.SPADES,10));
<<<<<<< HEAD
        assertTrue(instance.isFourOfAKind());
//        Ranker instance = null;
//        boolean expResult = false;
//        boolean result = instance.isFourOfAKind();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.

//        fail("The test case is a prototype.");
=======
        cards.add(new Card(Suit.HEARTS,7));
        cards.add(new Card(Suit.DIAMOND,7));
        
        Ranker instFHfalse2 = new Ranker(cards);
        assertFalse(instFHfalse2.isFullHouse());
>>>>>>> 2fdc2498096440f42985f3ad258d440b4ba3d29a
    }

    /**
     * method fourofkind akan menghasilkan nilai True dan False
     * method ini akan mengeluarkan nilai True Jika 4 dari total semua kartu (5) sama level.
     * @return True
     * method ini akan mengeluarkan nilai False . Jika tidak memenuhi syarat .
     * by: Sigit Yudhianto
     */
    @org.junit.Test
    public void testIsFourOfAKindTrue() {
        System.out.println("isFourOfAKind is True");
        List<Card> cardsT = new ArrayList<Card>();
        cardsT.add(new Card(Suit.CLUBS,10));
        cardsT.add(new Card(Suit.DIAMOND,10));
        cardsT.add(new Card(Suit.SPADES,10));
        cardsT.add(new Card(Suit.HEARTS,10));
        cardsT.add(new Card(Suit.SPADES,6));
        Ranker instanceT = new Ranker(cardsT);
        assertTrue(instanceT.isFourOfAKind());
        
    }
    
    @org.junit.Test
    public void testIsFourOfAKindFalse1() {
        System.out.println("isFourOfAKind is False1");
        List<Card> cardsF1 = new ArrayList<Card>();
        cardsF1.add(new Card(Suit.CLUBS,8));
        cardsF1.add(new Card(Suit.DIAMOND,7));
        cardsF1.add(new Card(Suit.SPADES,10));
        cardsF1.add(new Card(Suit.HEARTS,10));
        cardsF1.add(new Card(Suit.SPADES,8));
        Ranker instanceF1 = new Ranker(cardsF1);
        assertFalse(instanceF1.isFourOfAKind());
    }
    @org.junit.Test
    public void testIsFourOfAKindFalse2() {
        System.out.println("isFourOfAKind is False1");
        List<Card> cardsF2 = new ArrayList<Card>();
        cardsF2.add(new Card(Suit.CLUBS,8));
        cardsF2.add(new Card(Suit.DIAMOND,10));
        cardsF2.add(new Card(Suit.SPADES,10));
        cardsF2.add(new Card(Suit.HEARTS,10));
        cardsF2.add(new Card(Suit.SPADES,6));
        Ranker instanceF2 = new Ranker(cardsF2);
        assertFalse(instanceF2.isFourOfAKind());   
    }
    
    /**
     * Test of isStraighFlush method, of class Ranker.
     */
    @org.junit.Test
    public void testIsStraighFlushTrue() {
        System.out.println("isStraighFlush");
        List<Card> cards1 = new ArrayList<Card>();
        cards1.add(new Card(Suit.SPADES,4));
        cards1.add(new Card(Suit.SPADES,5));
        cards1.add(new Card(Suit.SPADES,6));
        cards1.add(new Card(Suit.SPADES,7));
        cards1.add(new Card(Suit.SPADES,8));
        Ranker instance1 = new Ranker(cards1);
        assertTrue(instance1.isStraighFlush());
        // TODO review the generated test code and remove the default call to fail.
    }
    @org.junit.Test
    public void testIsStraighFlushFalse() {
        System.out.println("isStraighFlush");
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.HEARTS,4));
        cards.add(new Card(Suit.SPADES,5));
        cards.add(new Card(Suit.DIAMOND,6));
        cards.add(new Card(Suit.SPADES,7));
        cards.add(new Card(Suit.SPADES,8));
        Ranker instance = new Ranker(cards);
        assertFalse(instance.isStraighFlush());
        
    }
    @org.junit.Test
    public void testIsStraighFlushFalse2() {
        System.out.println("isStraighFlush");
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.CLUBS,4));
        cards.add(new Card(Suit.SPADES,5));
        cards.add(new Card(Suit.DIAMOND,6));
        cards.add(new Card(Suit.SPADES,7));
        cards.add(new Card(Suit.DIAMOND,8));
        Ranker instance = new Ranker(cards);
        assertFalse(instance.isStraighFlush());
        // TODO review the generated test code and remove the default call to fail.
    }


    /**
     * Test of isRoyalFlush method, of class Ranker.
     */
    @org.junit.Test
    public void testIsRoyalFlush() {
        System.out.println("isRoyalFlush");
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.CLUBS,13));
        cards.add(new Card(Suit.CLUBS,12));
        cards.add(new Card(Suit.CLUBS,14));
        cards.add(new Card(Suit.CLUBS,11));
        cards.add(new Card(Suit.CLUBS,10));
        
        Ranker instanceRoyalFlush = new Ranker(cards);
        assertTrue(instanceRoyalFlush.isRoyalFlush());
    }

}
