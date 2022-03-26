class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length <= 2) {
            return true;
        }
        
        boolean isMonotonic = (nums[1] == nums[0]) ? false : true;
        
        boolean isIncreasing = isMonotonic ? nums[1] > nums[0] : false;
        
        for(int i = 1; i < nums.length; i++) {
            if(!isMonotonic) {
                if(nums[i] > nums[i - 1]) {
                    isIncreasing = true;
                    isMonotonic = true;
                } else if(nums[i] < nums[i - 1]) {
                    isIncreasing = false;
                    isMonotonic = true;
                }
            } else {
                if((isIncreasing && (nums[i] < nums[i - 1]))
                   || (!isIncreasing && (nums[i] > nums[i - 1]))) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
