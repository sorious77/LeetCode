class Solution {
    public int binaryGap(int n) {
        int start = -1;
        
        int op = 1;
        int index = 0;
        
        int answer = 0;
        
        while(op <= n) {
            if((op & n) == op) {
                if(start != -1) {
                    answer = Math.max(answer, index - start);
                    start = index;
                } else {
                    start = index;
                }
            }
            
            index++;
            op = op << 1;
        }
        
        return answer;
    }
}
