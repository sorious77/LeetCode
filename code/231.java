class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n % 2 != 0 && n != 1)
            return false;
        
        int num = 1;
        for(int i = 0; i < 31; i++) {
            if(n == num) {
                return true;
            }
            num = num << 1;
        }
        
        return false;
    }
}