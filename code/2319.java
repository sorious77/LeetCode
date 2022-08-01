class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int length = grid.length;
        
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if(i == j || (length - 1 - i) == j) {
                    if(grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    if(grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}
