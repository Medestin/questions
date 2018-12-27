package com.medestin.zero.matrix;

public class ZeroMatrix {
    private int[][] matrix;
    private boolean[] rows;
    private boolean[] columns;

    public ZeroMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.rows = new boolean[matrix.length];
        this.columns = new boolean[matrix[0].length];
    }

    public void zeroMatrix(){
        findZeros();
        for(int i = 0; i < matrix.length; i++){
            if(rows[i]){
                nullifyRow(i);
            }
        }
        for(int i = 0; i < matrix[0].length; i++){
            if(columns[i]){
                nullifyColumn(i);
            }
        }
    }

    private void findZeros(){
        for(int row = 0; row < rows.length; ++row) {
            for (int column = 0; column < columns.length; ++column) {
                if(matrix[row][column] == 0){
                    rows[row] = true;
                    columns[column] = true;
                }
            }
        }
    }

    private void nullifyRow(int row){
        for(int i = 0; i < matrix[0].length; ++i){
            matrix[row][i] = 0;
        }
    }

    private void nullifyColumn(int column){
        for(int i = 0; i < matrix.length; ++i){
            matrix[i][column] = 0;
        }
    }
}
