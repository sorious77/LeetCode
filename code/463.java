class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int answer = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 1) {
                    answer += getPerimeter(grid, j, i);
                }
            }
        }
        
        return answer;
    }
    
    int getPerimeter(int[][] grid, int x, int y) {
        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int n = grid.length;
        int m = grid[0].length;
        
        int perimeter = 0;
        
        for(int i = 0; i < 4; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];
            
            if(canMove(n, m, nx, ny)) {
                if(grid[ny][nx] == 0) {
                    perimeter += 1;
                }
            } else {
                perimeter += 1;
            }
        }
        
        return perimeter;
    }
    
    boolean canMove(int n, int m, int x, int y) {
        if(0 <= x && x < m && 0 <= y && y < n) {
            return true;
        }
        
        return false;
    }
}
