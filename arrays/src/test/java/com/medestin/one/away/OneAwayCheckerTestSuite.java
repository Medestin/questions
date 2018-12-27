package com.medestin.one.away;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneAwayCheckerTestSuite {
    private OneAwayChecker checker = new OneAwayChecker();

    @Test
    public void testIdentical(){
        String one = "abrakadabra";
        String two = "abrakadabra";

        assertTrue(checker.checkIfOneAway(one, two));
    }

    @Test
    public void testOneAdded(){
        String one = "abrakadabra";
        String two = "abrakadavbra";

        assertTrue(checker.checkIfOneAway(one, two));
    }

    @Test
    public void testOneRemoved(){
        String one = "abraadabra";
        String two = "abrakadabra";

        assertTrue(checker.checkIfOneAway(one, two));
    }

    @Test
    public void testOneChanged(){
        String one = "abrakadabra";
        String two = "abradadabra";

        assertTrue(checker.checkIfOneAway(one, two));
    }

    @Test
    public void testTwoAdded(){
        String one = "abrakadabra";
        String two = "abrafkadabraz";

        assertFalse(checker.checkIfOneAway(one, two));
    }

    @Test
    public void testTwoRemoved(){
        String one = "abrakadabra";
        String two = "abraadaba";

        assertFalse(checker.checkIfOneAway(one, two));
    }

    @Test
    public void testTwoChanged(){
        String one = "abrakadabra";
        String two = "adrakmdabra";

        assertFalse(checker.checkIfOneAway(one, two));
    }

    @Test
    public void testOneAddedAndOneChanged(){
        String one = "abrakadabra";
        String two = "abrdakadwbra";

        assertFalse(checker.checkIfOneAway(one, two));
    }

    @Test
    public void testOneRemovedAndOneChanged(){
        String one = "abrakadabra";
        String two = "arakadmbra";

        assertFalse(checker.checkIfOneAway(one, two));
    }
}