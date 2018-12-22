package com.medestin.palindrome.permutation;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTestSuite {
    private PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    public void checkIfPermutatedPalindromeTrueWithOddString() {
        String string = "abadb";

        assertTrue(palindromeChecker.checkIfPermutatedPalindrome(string));
    }

    @Test
    public void checkIfPermutatedPalindromeTrueWithEvenString(){
        String string= "aghfaghf";

        assertTrue(palindromeChecker.checkIfPermutatedPalindrome(string));
    }

    @Test
    public void checkIfPermutatedPalindromeTrueWithSentence() {
        String string = "I lali masoni wydrom w mordy wino, sami lali";

        assertTrue(palindromeChecker.checkIfPermutatedPalindrome(string));
    }

    @Test
    public void checkIfPermutatedPalindromeFalse() {
        String string = "jwnogwognfa";

        assertFalse(palindromeChecker.checkIfPermutatedPalindrome(string));
    }
}