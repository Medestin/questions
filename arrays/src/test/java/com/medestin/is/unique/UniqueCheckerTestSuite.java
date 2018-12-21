package com.medestin.is.unique;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueCheckerTestSuite {
    private UniqueChecker uniqueChecker = new UniqueChecker();

    @Test
    public void testPositive(){
        String sentence = "The Quick Brown Fox Jumps Over The Lazy Dog";

        assertTrue(uniqueChecker.checkUnique(sentence));
    }

    @Test
    public void testNegative(){
        String sentence = "Nobody expects the Spanish Inquisition!";

        assertFalse(uniqueChecker.checkUnique(sentence));
    }

}