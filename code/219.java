class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<=k;j++){
                if(i + j >= nums.length)
                    break;
                
                if(nums[i] == nums[i+j])
                    result = true;
            }
        }
        
        return result;
    }
}