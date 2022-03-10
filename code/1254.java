class Solution {
    class Pair {
        int x, y;
        
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    int n, m;
    
    public int closedIsland(int[][] grid) {
        int answer = 0;
        
        n = grid.length;
        m = grid[0].length;
        
        boolean[][] visited = new boolean[n][m];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(!visited[i][j] && grid[i][j] == 0 && isClosed(j, i, grid, visited)) {
                    answer += 1;
                }
            }
        }
        
        return answer;
    }
    
    boolean isClosed(int x, int y, int[][] grid, boolean[][] visited) {
        boolean flag = true;
        
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(x, y));
        
        while(!q.isEmpty()) {
            Pair cur = q.poll();
            
            if(cur.x == 0 || cur.y == 0 || cur.x == (m - 1) || cur.y == (n - 1)) {
                flag = false;
            }
            
            if(canMove(cur.x - 1, cur.y, grid, visited)) {
                visited[cur.y][cur.x - 1] = true;
                q.offer(new Pair(cur.x - 1, cur.y));
            }
            
            if(canMove(cur.x + 1, cur.y, grid, visited)) {
                visited[cur.y][cur.x + 1] = true;
                q.offer(new Pair(cur.x + 1, cur.y));
            }
            
            if(canMove(cur.x, cur.y - 1, grid, visited)) {
                visited[cur.y - 1][cur.x] = true;
                q.offer(new Pair(cur.x, cur.y - 1));
            }
            
            if(canMove(cur.x, cur.y + 1, grid, visited)) {
                visited[cur.y + 1][cur.x] = true;
                q.offer(new Pair(cur.x, cur.y + 1));
            }
        }
        
        return flag;
    }
    
    boolean canMove(int x, int y, int[][] grid, boolean[][] visited) {
        return 0 <= x && x < m && 0 <= y && y < n && grid[y][x] == 0 && !visited[y][x];
    }
}
