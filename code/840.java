class Solution {
    boolean isMagicSquare(int[][] grid, int sx, int sy) {
        int sum = grid[sy][sx] + grid[sy][sx + 1] + grid[sy][sx + 2];
        
        for(int i = 0; i < 3; i++) {
            if(sum != (grid[sy + i][sx] + grid[sy + i][sx + 1] + grid[sy + i][sx + 2]))
                return false;
            
            if(sum != (grid[sy][sx + i] + grid[sy + 1][sx + i] + grid[sy + 2][sx + i]))
                return false;
        }
        
        if(sum != (grid[sy][sx] + grid[sy + 1][sx + 1] + grid[sy + 2][sx + 2])
           || sum != (grid[sy][sx + 2] + grid[sy + 1][sx + 1] + grid[sy + 2][sx])) {
            
            return false;
        }
        
        boolean[] exist = new boolean[16];
        for(int i = sy; i < sy + 3; i++) {
            for(int j = sx; j < sx + 3; j++) {
                if(exist[grid[i][j]] || grid[i][j] >= 10 || grid[i][j] == 0)
                    return false;
                
                exist[grid[i][j]] = true;
            }
        }
        
        return true;
    }
    
    public int numMagicSquaresInside(int[][] grid) {
        int answer = 0;
        
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i = 0; i <= n - 3; i++) {
            for(int j = 0; j <= m - 3; j++) {
                if(isMagicSquare(grid, j, i)) {
                    answer += 1;
                }
            }
        }
        
        return answer;
    }
}
