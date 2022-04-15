class Solution {
    public int getMaximumGenerated(int n) {
        if(n <= 1) {
            return n;
        }
        
        int[] dp = new int[n + 1];
        dp[1] = 1;
        
        int answer = 1;
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                dp[i] = dp[i / 2];
            } else {
                dp[i] = dp[i / 2] + dp[i / 2 + 1];
            }
            
            answer = Math.max(answer, dp[i]);
        }
        
        return answer;
    }
}
