class Solution {
    public int countBattleships(char[][] board) {
        int answer = 0;
        
        int n = board.length;
        int m = board[0].length;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == 'X') {
                    answer++;
                    board[i][j] = 'O';
                    
                    int x = j + 1;
                    int y = i + 1;
                    
                    while(y < n) {
                        if(board[y][j] != 'X')
                            break;

                        board[y][j] = 'O';
                        y++;
                    }
                    
                    while(x < m) {
                        if(board[i][x] != 'X')
                            break;
                        
                        board[i][x] = 'O';
                        x++;
                    }
                }
            }
        }
            
        return answer;
    }
}
