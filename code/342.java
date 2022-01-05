class Solution {
    double log4(int n) {
        return Math.log10(n) / Math.log10(4);
    }
    
    public boolean isPowerOfFour(int n) {
        double logN = log4(n);
        
        return (((int)logN - logN) == 0);
    }
}
