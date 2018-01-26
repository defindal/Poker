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
        cards.add(new Card(Suit.CLUBS,10));
        cards.add(new Card(Suit.DIAMOND,10));
        cards.add(new Card(Suit.SPADES,10));
        cards.add(new Card(Suit.HEARTS,11));
        cards.add(new Card(Suit.CLUBS,7));
        
        Ranker instance = new Ranker(cards);
        assertTrue(instance.isOnePair());
        
    }

    /**
     * Test of isTwoPairs method, of class Ranker.
     */
    @org.junit.Test
    public void testIsTwoPairs() {
        System.out.println("isTwoPairs");
        Ranker instance = null;
        boolean expResult = false;
        boolean result = instance.isTwoPairs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isThreeAKind method, of class Ranker.
     */
    @org.junit.Test
    public void testIsThreeAKind() {
        System.out.println("isThreeAKind");
        Ranker instance = null;
        boolean expResult = false;
        boolean result = instance.isThreeAKind();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFlush method, of class Ranker.
     */
    @org.junit.Test
    public void testIsFlush() {
        System.out.println("isFlush");
        Ranker instance = null;
        boolean expResult = false;
        boolean result = instance.isFlush();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFourOfAKind method, of class Ranker.
     */
    @org.junit.Test
    public void testIsFourOfAKind() {
        System.out.println("isFourOfAKind");
        Ranker instance = null;
        boolean expResult = false;
        boolean result = instance.isFourOfAKind();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRoyalFlush method, of class Ranker.
     */
    @org.junit.Test
    public void testIsRoyalFlush() {
        System.out.println("isRoyalFlush");
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Suit.CLUBS,10));
        cards.add(new Card(Suit.CLUBS,12));
        cards.add(new Card(Suit.CLUBS,14));
        cards.add(new Card(Suit.CLUBS,11));
        cards.add(new Card(Suit.CLUBS,13));
        
        Ranker instance = new Ranker(cards);
        assertTrue(instance.isRoyalFlush());
    }
    
}
