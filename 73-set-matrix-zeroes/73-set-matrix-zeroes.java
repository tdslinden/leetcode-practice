class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Boolean rowZero = false;
        
        // determine which rows/cols need to be zero
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (matrix[r][c] == 0) {
                    matrix[0][c] = 0;
                    if (r > 0) {
                        matrix[r][0] = 0;
                    } else {
                        rowZero = true;
                    }
                }
            }
        }
        
        for (int r = 1; r < row; r++) {
            for (int c = 1; c < col; c++) {
                if (matrix[0][c] == 0 || matrix[r][0] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }
        
        if (matrix[0][0] == 0) {
            for (int r = 0; r < row; r++) {
                matrix[r][0] = 0;
            }
        }
        
        if (rowZero) {
            for (int c = 0; c < col; c++) {
                matrix[0][c] = 0;
            }
        }
    } 
}