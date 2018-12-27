package com.medestin.rotate.matrix;

public class MatrixRotator {
    private int[][] matrix;

    public MatrixRotator(int[][] matrix) {
        this.matrix = matrix;
    }

    public boolean rotateMatrix(){
        if(!isMatrixEven()){
           return false;
        }
        for(int layer = 0; layer < matrix.length/2; ++layer){
            int first = layer;
            int last = matrix.length - 1 - layer;
            for(int i = first; i < last; ++i){
                int offset = i - first;
                //hold top
                int holder = matrix[first][i];
                //left to top
                matrix[first][i] = matrix[last-offset][first];
                //bottom to left
                matrix[last-offset][first] = matrix[last][last-offset];
                //right to bottom
                matrix[last][last-offset] = matrix[i][last];
                //hold to right
                matrix[i][last] = holder;
            }
        }
        return true;
    }

    private boolean isMatrixEven(){
        return (matrix.length == matrix[0].length);
    }

    public int[] firstRow(){
        return matrix[0];
    }
}
