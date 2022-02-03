class Solution {
    int []fibo;
    
    public int fib(int n) {
        fibo = new int[31];
        
        fibo[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 1];
        }
        
        return fibo[n];
    }
}
