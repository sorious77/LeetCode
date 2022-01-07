class Solution {
    void travel(char[][] grid, int x, int y, int n, int m) {
        grid[y][x] = '-';
        
        if(x - 1 >= 0 && grid[y][x - 1] == '1') {
            travel(grid, x - 1, y, n, m);
        }
        
        if(x + 1 < n && grid[y][x + 1] == '1') {
            travel(grid, x + 1, y, n, m);
        }
        
        if(y - 1 >= 0 && grid[y - 1][x] == '1') {
            travel(grid, x, y - 1, n, m);
        }
        
        if(y + 1 < m && grid[y + 1][x] == '1') {
            travel(grid, x, y + 1, n, m);
        }
    }
    
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int count = 0;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    travel(grid, j, i, n, m);
                    count++;
                }
            }
        }
        
        return count;
    }
}
