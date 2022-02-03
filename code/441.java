class Solution {
    public int arrangeCoins(int n) {
        long left = 1;
        long right = n;
        
        while(left <= right) {
            long mid = (left + right) / 2;
            
            long prevStair = (mid + 1) * mid / 2;
            long nextStair = (mid + 1) * (mid + 2) / 2;
            
            if(prevStair <= n && n < nextStair) {
                return (int) mid;
            } else if(n < prevStair) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return (int)left;
    }
}
