package com.medestin.urlify;

import org.junit.Test;

import static org.junit.Assert.*;

public class UrlifierTestSuite {
    private Urlifier urlifier = new Urlifier();

    @Test
    public void testUrlifier(){
        String urlifiedString = urlifier.urlify("ala ma kota");

        assertEquals("ala%20ma%20kota", urlifiedString);
    }
}