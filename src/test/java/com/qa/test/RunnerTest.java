package com.qa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.main.Blackjack;

public class RunnerTest {

    // annotations
    @BeforeClass
    public static void setup() {
        System.out.println("Before class");
    }

    @Before
    public void init() {
        System.out.println("Before test");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @After
    public void finalise() {
        System.out.println("After test");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("After class");
    }
    // -----------------------------------

    // assertions

    @Test
    public void thisEqualsThat() {
        int num = 12;
        int otherNum = num;
        assertEquals(num, otherNum);
    }

    @Test
    public void thisDoesNotEqualThat() {
        int num = 13;
        int otherNum = 63;
        assertNotEquals(num, otherNum);
    }

    @Test
    public void thisBoolIsTrueTest() {
        boolean thisBool = true;
        assertTrue(thisBool);
    }

    @Test
    public void thisIsFalseTest() {
        assertFalse(1 == 2);
    }

    @Test
    public void objectIsNull() {
        Object obj = null;
        assertNull("Expected: Null Object", obj);
    }

    @Test
    public void objectIsNotNull() {
        Object obj = "Not Null";
        assertNotNull("Expected: Not Null Object", obj);
    }
    // -----------------------------------

    // blackjack tests
    @Test
    public void dealerBustTest() {
        Blackjack b = new Blackjack();
        assertEquals(1, b.play(22, 1));
    }

    // ... continue these :D
}
