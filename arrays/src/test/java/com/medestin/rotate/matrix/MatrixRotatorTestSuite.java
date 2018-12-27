package com.medestin.rotate.matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixRotatorTestSuite {

    @Test
    public void testRotate5x5Matrix(){
        int[][] matrix = {
                {1,2,3,4,5},
                {5,1,2,3,4},
                {4,5,1,2,3},
                {3,4,5,1,2},
                {2,3,4,5,1}
        };

        MatrixRotator rotator = new MatrixRotator(matrix);

        assertTrue(rotator.rotateMatrix());
        assertEquals(2, matrix[0][0]);
        assertEquals(3, matrix[0][1]);
        assertEquals(4, matrix[0][2]);
        assertEquals(5, matrix[0][3]);
        assertEquals(1, matrix[0][4]);
    }

    @Test
    public void testRotate6x6Matrix(){
        int[][] matrix = {
                {1,2,3,4,5,6},
                {2,3,4,5,6,1},
                {3,4,5,6,1,2},
                {4,5,6,1,2,3},
                {5,6,1,2,3,4},
                {6,1,2,3,4,5}
        };

        MatrixRotator rotator = new MatrixRotator(matrix);

        assertTrue(rotator.rotateMatrix());
        assertEquals(6, matrix[0][0]);
        assertEquals(5, matrix[0][1]);
        assertEquals(4, matrix[0][2]);
        assertEquals(3, matrix[0][3]);
        assertEquals(2, matrix[0][4]);
        assertEquals(1, matrix[0][5]);

        assertEquals(3, matrix[1][4]);
        assertEquals(4, matrix[2][4]);
        assertEquals(5, matrix[3][4]);
        assertEquals(6, matrix[4][4]);

        assertEquals(6, matrix[2][2]);
        assertEquals(5, matrix[2][3]);
    }

    @Test
    public void shouldReturnFalse(){
        int[][] matrix = {
                {1,2,3,4,5,6},
                {2,3,4,5,6,1},
                {3,4,5,6,1,2},
                {4,5,6,1,2,3},
                {5,6,1,2,3,4},
        };

        MatrixRotator rotator = new MatrixRotator(matrix);

        assertFalse(rotator.rotateMatrix());
    }
}