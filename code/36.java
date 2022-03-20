class Solution {
    boolean isValidRow(char[][] board, int row) {
        int[] count = new int[10];
        
        for(int i = 0; i < 9; i++) {
            if(board[row][i] != '.') {
                int cur = board[row][i] - '0';

                count[cur] += 1;

                if(count[cur] >= 2) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    boolean isValidCol(char[][] board, int col) {
        int[] count = new int[10];
        
        for(int i = 0; i < 9; i++) {
            if(board[i][col] != '.') {
                int cur = board[i][col] - '0';

                count[cur] += 1;

                if(count[cur] >= 2) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    boolean isValidBox(char[][] board, int num) {
        int startX = (num % 3) * 3;
        int startY = (num / 3) * 3;
        int endX = startX + 3;
        int endY = startY + 3;
        
        int[] count = new int[10];
        for(int i = startY; i < endY; i++) {
            for(int j = startX; j < endX; j++) {
                if(board[i][j] != '.') {
                    int cur = board[i][j] - '0';

                    count[cur] += 1;

                    if(count[cur] >= 2) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
    
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            if(!isValidRow(board, i) || !isValidCol(board, i) || !isValidBox(board, i)) {
                return false;   
            }
        }
        
        return true;
    }
}
