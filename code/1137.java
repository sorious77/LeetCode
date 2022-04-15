class Solution {
    public int tribonacci(int n) {
        if(n <= 1) {
            return n;
        }
        
        if(n == 2) {
            return 1;
        }
        
        int[] fibo = new int[n + 1];
        fibo[1] = 1;
        fibo[2] = 1;
        
        for(int i = 3; i <= n; i++) {
            fibo[i] = fibo[i - 3] + fibo[i - 2] + fibo[i - 1];
        }
        
        return fibo[n];
    }
}
