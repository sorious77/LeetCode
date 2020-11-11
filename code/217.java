class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0)
            return false;
        
        Arrays.sort(nums);
        
        int prev = nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(prev == nums[i])
                return true;
            
            prev = nums[i];
        }
        
        return false;
    }
}