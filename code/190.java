public class Solution {
    public int reverseBits(int n) {
        int answer = 0;
        
        for(int i = 0; i < 32; i++) {
            answer = answer << 1;
            answer += n & 1;
            n = n >> 1;
        }
        
        return answer;
    }
}
