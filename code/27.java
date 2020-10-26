class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0 || (nums.length == 1 && nums[0] == val)){
            return 0;
        }
               
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                nums[i] = -1;
            }
        }
        
        int index = 0;
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == -1){
                for(index = i + 1;index<nums.length;index++){
                    if(nums[index] != -1){
                        nums[i] = nums[index];
                        nums[index] = -1;
                        count++;
                        break;
                    }
                }
            }
            else{
                count++;
            }
        }
        
        return count;
    }
}