class Solution {
    public int findMin(int[] nums) {
        int minValue = nums[0];
        
        for(int i=0;i<nums.length;i++){
            if(minValue > nums[i]){
                minValue = nums[i];
            }
        }
        return minValue;
    }
}