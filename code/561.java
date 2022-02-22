class Solution {
    public int arrayPairSum(int[] nums) {
        int length = nums.length / 2;
        
        Arrays.sort(nums);
        
        int sum = 0;
        
        for(int i = 0; i < length; i++) {
            sum += nums[i * 2];
        }
        
        return sum;
    }
}
