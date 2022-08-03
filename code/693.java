class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean isZero = (n % 2) == 0 ? false : true;
        
        while(n > 0) {
            int left = n % 2;
            
            if((left == 0 && isZero) || (left == 1 && !isZero)) {
                return false;
            }
            
            isZero = (n % 2) == 0 ? true : false;
            n /= 2;
        }
        
        return true;
    }
}
