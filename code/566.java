class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r * c != mat.length * mat[0].length) {
            return mat;
        }
        
        int[][] newMat = new int[r][c];
        
        int row = 0;
        int col = 0;
        
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                newMat[i][j] = mat[row][col];
                
                col += 1;
                
                if(col >= mat[0].length) {
                    col = 0;
                    row += 1;
                }
            }
        }
        
        return newMat;
    }
}
