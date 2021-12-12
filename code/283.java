class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        
        int cur = 0;
        
        for(int i = 0; i < length; i++) {
            if(nums[i] != 0) {
                nums[cur++] = nums[i];
            }
        }
        
        Arrays.fill(nums, cur, length, 0);
    }
}
