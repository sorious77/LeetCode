class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1)
            return 0;
        
        int length = nums.length;
        
        if(nums[0] > nums[1]) {
            return 0;
        } 
        
        if(nums[length - 1] > nums[length - 2]) {
            return length - 1; 
        }
        
        for(int i = 1; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                return i;
            }
        }
        
        return 0;
    }
}
