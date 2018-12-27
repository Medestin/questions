package com.medestin.zero.matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroMatrixTestSuite {

    @Test
    public void testOneZero(){
        int[][] matrix = {
                {0,2,3,4,5},
                {5,1,2,3,4},
                {4,5,1,2,3},
                {3,4,5,1,2},
        };
        ZeroMatrix zeroMatrix = new ZeroMatrix(matrix);
        zeroMatrix.zeroMatrix();

        assertEquals(0, matrix[0][4]);
        assertEquals(0, matrix[3][0]);
        assertEquals(1, matrix[1][1]);
    }

    @Test
    public void testTwoZeros(){
        int[][] matrix = {
                {1,2,3,4,5},
                {5,0,2,3,4},
                {4,5,1,0,3},
                {3,4,5,1,2},
        };
        ZeroMatrix zeroMatrix = new ZeroMatrix(matrix);
        zeroMatrix.zeroMatrix();

        assertEquals(1, matrix[0][0]);
        assertEquals(0, matrix[0][1]);
        assertEquals(0, matrix[2][4]);
    }

    @Test
    public void testNoZeros(){
        int[][] matrix = {
                {1,2,3,4,5},
                {5,1,2,3,4},
                {4,5,1,2,3},
                {3,4,5,1,2},
        };
        ZeroMatrix zeroMatrix = new ZeroMatrix(matrix);
        zeroMatrix.zeroMatrix();

        assertEquals(1, matrix[0][0]);
        assertEquals(1, matrix[1][1]);
        assertEquals(1, matrix[2][2]);
        assertEquals(1, matrix[3][3]);
    }
}