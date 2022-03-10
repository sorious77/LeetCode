class Solution {
    class Pair {
        int x, y;
        
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    int n, m;
    
    public int numEnclaves(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        
        boolean[][] isVisited = new boolean[n][m];
        
        int answer = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 1 && !isVisited[i][j]) {
                    answer += countEnclave(j, i, grid, isVisited);
                }
            }
        }
        
        return answer;
    }
    
    int countEnclave(int x, int y, int[][] grid, boolean[][] isVisited) {
        boolean isEnclave = true;
        int count = 0;
        
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(x, y));
        isVisited[y][x] = true;
        
        while(!q.isEmpty()) {
            Pair cur = q.poll();
            count += 1;
            
            if(cur.x == 0 || cur.y == 0 || cur.x == (m - 1) || cur.y == (n - 1)) {
                isEnclave = false;
            }
            
            if(canMove(cur.x - 1, cur.y, grid, isVisited)) {
                q.offer(new Pair(cur.x - 1, cur.y));
                isVisited[cur.y][cur.x - 1] = true;
            }
            
            if(canMove(cur.x + 1, cur.y, grid, isVisited)) {
                q.offer(new Pair(cur.x + 1, cur.y));
                isVisited[cur.y][cur.x + 1] = true;
            }
            
            if(canMove(cur.x, cur.y - 1, grid, isVisited)) {
                q.offer(new Pair(cur.x, cur.y - 1));
                isVisited[cur.y - 1][cur.x] = true;
            }
            
            if(canMove(cur.x, cur.y + 1, grid, isVisited)) {
                q.offer(new Pair(cur.x, cur.y + 1));
                isVisited[cur.y + 1][cur.x] = true;
            }
        }
        
        return isEnclave ? count : 0;
    }
    
    boolean canMove(int x, int y, int[][] grid, boolean[][] isVisited) {
        return 0 <= x && x < m && 0 <= y && y < n && grid[y][x] == 1 && !isVisited[y][x];
    }
}
