class Solution {
    public void gameOfLife(int[][] board) {
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        
        int n = board.length;
        int m = board[0].length;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int count = 0;
                
                for(int k = 0; k < 8; k++) {
                    int nX = j + dir[k][0];
                    int nY = i + dir[k][1];
                    
                    if(0 <= nX && nX < m && 0 <= nY && nY < n && board[nY][nX] % 10 == 1) {
                        count++;
                    }
                }
                
                if(board[i][j] == 1) {
                    if(count < 2 || count > 3) {
                        board[i][j] = 1;
                    } else {
                        board[i][j] = 11;
                    }
                } else {
                    if(count == 3) {
                        board[i][j] = 10;
                    }
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                board[i][j] = board[i][j] / 10;
            }
        }
    }
}
