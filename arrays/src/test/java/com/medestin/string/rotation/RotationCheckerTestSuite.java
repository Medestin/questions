package com.medestin.string.rotation;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotationCheckerTestSuite {
    private RotationChecker rotationChecker = new RotationChecker();

    @Test
    public void checkWaterbottle(){
        String original = "waterbottle";
        String rotated = "ttlewaterbo";

        assertTrue(rotationChecker.isRotated(original, rotated));
    }

    @Test
    public void shouldReturnTrue(){
        String original = "konstantynopol";
        String rotated = "ynopolkonstant";

        assertTrue(rotationChecker.isRotated(original, rotated));
    }

    @Test
    public void shouldReturnFalse(){
        String original = "kaloryfer";
        String rotated = "refkalory";

        assertFalse(rotationChecker.isRotated(original, rotated));
    }

    @Test
    public void checkDifferentLengths(){
        String original = "kaloryfer";
        String rotated = "refry";

        assertFalse(rotationChecker.isRotated(original, rotated));
    }

    @Test
    public void checkEmpty(){
        String original = "";
        String rotated = "";

        assertFalse(rotationChecker.isRotated(original, rotated));
    }
}