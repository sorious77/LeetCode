class Solution {
    class Pair {
        int x, y;
        
        Pair() {}
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int time = 0;
        int [][]move = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        Queue<Pair> q = new LinkedList<>();
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 2) {
                    q.offer(new Pair(j, i));
                }
            }
        }
        
        while(true) {
            int size = q.size();
            
            for(int i = 0; i < size; i++) {
                Pair cur = q.poll();
                
                for(int j = 0; j < 4; j++) {
                    Pair next = new Pair(cur.x + move[j][0], cur.y + move[j][1]);
                    
                    if(0 <= next.x && next.x < n && 0 <= next.y && next.y < m) {
                        if(grid[next.y][next.x] == 1) {
                            grid[next.y][next.x] = 2;
                            q.offer(next);
                        }
                    }
                }
            }
            
            if(q.isEmpty()) {
                break;
            }
            
            time++;
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1)
                    return -1;
            }
        }
        
        return time;
    }
}