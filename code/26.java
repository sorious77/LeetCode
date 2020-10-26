class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        
        int cur = nums[0];
        int count = 1;
        int index = 1;
        
        for(int i=1;i<nums.length;i++){
            if(cur == nums[i]){
                continue;
            }
            else{
                cur = nums[i];
                nums[index++] = cur;
                count++;
            }
        }
        
        return count;
    }
}