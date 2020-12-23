class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        
        for(int i=0;i<moves.length();i++){
            char cur = moves.charAt(i);
            
            if(cur == 'U')
                y++;
            else if(cur == 'D')
                y--;
            else if(cur == 'L')
                x--;
            else
                x++;
        }
        
        if(x == 0 && y == 0)
            return true;
        else
            return false;
    }
}
