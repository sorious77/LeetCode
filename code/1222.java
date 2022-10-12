class Solution {
    class Pair {
        int x, y;
        int dir;
        
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> answer = new ArrayList<>();
        
        int[][] map = new int[8][8];
        for(int[] queen : queens) {
            map[queen[0]][queen[1]] = 1;
        }
        
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {-1, 1}, {-1, -1}, {1, 1}, {1, -1}};
        
        for(int i = 0; i < 8; i++) {
            Queue<Pair> q = new LinkedList<>();
            
            q.offer(new Pair(king[1], king[0]));
            
            while(!q.isEmpty()) {
                Pair p = q.poll();
                
                int nx = p.x + dir[i][0];
                int ny = p.y + dir[i][1];
                
                if(0 <= nx && nx < 8 && 0 <= ny && ny < 8) {
                    if(map[ny][nx] == 1) {
                        List<Integer> queen = new ArrayList<>();
                        queen.add(ny);
                        queen.add(nx);
                        
                        answer.add(queen);
                        
                        break;
                    } else {
                        q.offer(new Pair(nx, ny));
                    }
                }
            }
        }
        
        return answer;
    }
}
