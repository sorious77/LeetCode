public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        if(n < 0){
            n = ~n;
            
            while(n > 0){
                if((n & 1) == 1){
                    count++;
                }
                n = n >> 1;
            }
            count = 32 - count;
        }
        else{
            while(n > 0){
                if((n & 1) == 1){
                    count++;
                }
                n = n >> 1;
            }
        }
        return count;
    }
}
