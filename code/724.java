class Solution {
    int[] getPrefixSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            sum[i] = nums[i] + sum[i - 1];
        }
        
        return sum;
    }
    
    public int pivotIndex(int[] nums) {
        int[] sum = getPrefixSum(nums);
        
        for(int i = 0; i < nums.length; i++) {
            int leftSum = (i == 0) ? 0 : sum[i - 1];
            int rightSum = (i == nums.length - 1) ? 0 : sum[nums.length - 1] - sum[i];
            
            if(leftSum == rightSum) {
                return i;
            }
        }
        
        return -1;
    }
}
