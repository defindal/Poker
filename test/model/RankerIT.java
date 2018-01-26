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

        Ranker instance = new Ranker(cards);
        assertTrue(instance.isTwoPairs());

        System.out.println("isTwoPairs (Case False 1)");
        cards.add(new Card(Suit.DIAMOND, 7));
        cards.add(new Card(Suit.SPADES, 7));
        cards.add(new Card(Suit.HEARTS, 8));
        cards.add(new Card(Suit.CLUBS, 8));
        cards.add(new Card(Suit.HEARTS, 7));

        assertFalse(instance.isTwoPairs());

        System.out.println("isTwoPairs (Case False 2)");
        cards.add(new Card(Suit.CLUBS, 1));
        cards.add(new Card(Suit.HEARTS, 4));
        cards.add(new Card(Suit.DIAMOND, 6));
        cards.add(new Card(Suit.DIAMOND, 2));
        cards.add(new Card(Suit.SPADES, 4));

        assertFalse(instance.isTwoPairs());

        System.out.println("isTwoPairs (Case False 3)");
        cards.add(new Card(Suit.HEARTS, 1));
        cards.add(new Card(Suit.HEARTS, 5));
        cards.add(new Card(Suit.HEARTS, 3));
        cards.add(new Card(Suit.HEARTS, 4));
        cards.add(new Card(Suit.HEARTS, 2));

        assertFalse(instance.isTwoPairs());
    }

    /**
     * Test of isThreeAKind method, of class Ranker.
     */
    @org.junit.Test
    public void testIsThreeAKind() {
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.CLUBS,11));
        cards.add(new Card(Suit.DIAMOND,11));
        cards.add(new Card(Suit.SPADES,11));
        cards.add(new Card(Suit.HEARTS,6));
        cards.add(new Card(Suit.SPADES,1));
        Ranker instance3kindt = new Ranker(cards);
        assertTrue(instance3kindt.isThreeAKind());
    }
    
    @org.junit.Test
    public void testIsThreeAKindFalse1() {
        System.out.println("isThreeAKind");
        List<Card> cards1 = new ArrayList<Card>();
        cards1.add(new Card(Suit.CLUBS,3));
        cards1.add(new Card(Suit.DIAMOND,6));
        cards1.add(new Card(Suit.SPADES,3));
        cards1.add(new Card(Suit.HEARTS,6));
        cards1.add(new Card(Suit.DIAMOND,3));
        Ranker instance3kindf = new Ranker(cards1);
        assertFalse(instance3kindf.isThreeAKind());
    }
    
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
    }

    /**
     * Test of isStraight method, of class Ranker.
     */
    @org.junit.Test
    public void testIsStraight() {
        System.out.println("isStraight");
        Ranker instance = null;
        boolean expResult = false;
        boolean result = instance.isStraight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isFlush method, of class Ranker.
     * Yusuf Hanafi Angkat
     */
    @org.junit.Test
    public void testIsFlush() {
        
        System.out.println("isFlush 1 : Benar (assertTrue)");
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.HEARTS, 10));
        cards.add(new Card(Suit.HEARTS, 7));
        cards.add(new Card(Suit.HEARTS, 8));
        cards.add(new Card(Suit.HEARTS, 5));
        cards.add(new Card(Suit.HEARTS, 7));
        cards.add(new Card(Suit.HEARTS,10));
        cards.add(new Card(Suit.HEARTS,7));
        cards.add(new Card(Suit.HEARTS,8));
        cards.add(new Card(Suit.HEARTS,5));
        cards.add(new Card(Suit.HEARTS,7));
        Ranker instance = new Ranker(cards);
        assertTrue(instance.isFlush());
                
        System.out.println("isFlush 2 : Salah (assertFalse)");
        List<Card> cards2 = new ArrayList<Card>();
        cards2.add(new Card(Suit.DIAMOND,10));
        cards2.add(new Card(Suit.HEARTS,7));
        cards2.add(new Card(Suit.HEARTS,8));
        cards2.add(new Card(Suit.HEARTS,5));
        cards2.add(new Card(Suit.HEARTS,7));
        Ranker instance2 = new Ranker(cards2);
        assertFalse(instance2.isFlush());
        
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
        Ranker instance = null;
        boolean expResult = false;
        boolean result = instance.isFullHouse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isFourOfAKind method, of class Ranker.
     */
    @org.junit.Test
    public void testIsFourOfAKind() {
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.CLUBS,10));
        cards.add(new Card(Suit.DIAMOND,10));
        cards.add(new Card(Suit.SPADES,7));
        cards.add(new Card(Suit.HEARTS,10));
        cards.add(new Card(Suit.SPADES,10));
        Ranker instance = new Ranker(cards);
        assertTrue(instance.isFourOfAKind());
    }

    /**
     * Test of isStraighFlush method, of class Ranker.
     */
    @org.junit.Test
    public void testIsStraighFlush() {
        System.out.println("isStraighFlush");
        Ranker instance = null;
        boolean expResult = false;
        boolean result = instance.isStraighFlush();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isRoyalFlush method, of class Ranker.
     */
    @org.junit.Test
    public void testIsRoyalFlush() {
        System.out.println("isRoyalFlush");
        Ranker instance = null;
        boolean expResult = false;
        boolean result = instance.isRoyalFlush();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
