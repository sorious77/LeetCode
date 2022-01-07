class Solution {
    int find(int []p, int x) {
        if(p[x] == x) {
            return x;
        }
        
        return p[x] = find(p, p[x]);
    }
    
    void union(int []p, int x, int y) {
        x = find(p, x);
        y = find(p, y);
        
        if(x == y) {
            return;
        }
        
        p[x] = y;
    }
    
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int []parent = new int[n];
        
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j && isConnected[i][j] != 0) {
                    union(parent, i, j);
                }
            }
        }
        
        int answer = 0;
        for(int i = 0; i < n; i++) {
            if(parent[i] == i) {
                answer++;
            }
        }
        
        return answer;
    }
}
