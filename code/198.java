class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        
        int length = nums.length;
        
        int [][]dp = new int[length][2];
        
        dp[0][0] = nums[0];
        dp[0][1] = 0;
        
        dp[1][0] = nums[1];
        dp[1][1] = nums[0];
        
        for(int i=2;i<length;i++){
            dp[i][0] = Math.max(dp[i - 2][0], dp[i - 1][1]) + nums[i];
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
        }
        
        return Math.max(dp[length - 1][0], dp[length - 1][1]);
    }
}