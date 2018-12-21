package com.medestin.check.permutation;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationCheckerTestSuite {
    private PermutationChecker permutationChecker = new PermutationChecker();

    @Test
    public void testCheckForTrue(){
        String one = "Quid est veritas?";
        String two = "Vir est qui adest";

        assertTrue(permutationChecker.checkPermutation(one, two));
    }

    @Test
    public void testCheckForFalse(){
        String one = "siala baba mak";
        String two = "nie wiedziala jak";

        assertFalse(permutationChecker.checkPermutation(one, two));
    }

}