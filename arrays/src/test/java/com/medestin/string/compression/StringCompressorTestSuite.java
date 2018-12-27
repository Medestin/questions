package com.medestin.string.compression;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressorTestSuite {
    private StringCompressor compressor = new StringCompressor();

    @Test
    public void shouldReturnOriginalString(){
        String string = "abcdefgh";

        assertEquals("abcdefgh", compressor.compress(string));
    }

    @Test
    public void testWhenEqualLength(){
        String string = "aabbccddeeff";

        assertEquals("aabbccddeeff", compressor.compress(string));
    }

    @Test
    public void shouldReturnCompressedString(){
        String string = "aaabbccddeefff";

        assertEquals("a3b2c2d2e2f3", compressor.compress(string));
    }

    @Test
    public void shouldReturnCompressedString2(){
        String string = "aaabbccddeefffaaar";

        assertEquals("a3b2c2d2e2f3a3r1", compressor.compress(string));
    }
}