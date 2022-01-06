class Solution {
    int countBit(int n) {
        int count = 0;
        
        while(n >= 1) {
            count += n % 2;
            
            n /= 2;
        }
        
        return count;
    }
    
    public int[] countBits(int n) {
        int []bits = new int[n + 1];
        
        for(int i = 0; i <= n; i++) {
            bits[i] = countBit(i);
        }
        
        return bits;
    }
}
