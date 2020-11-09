import java.util.*;

class Solution {
    public void nextPermutation(int[] nums) {
        int i, j;
        i = -1;
        j = 0;
        
        for(int index = 0;index < nums.length - 1; index++){
            if(nums[index] < nums[index + 1]){
                i = index;
            }
        }
        
        if(i == -1){
            Arrays.sort(nums);
            return;
        }
        
        for(int index = nums.length - 1; index > i; index--){
            if(nums[index] > nums[i]){
                j = index;
                break;
            }
        }
        
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;       
        
        
        for(int index = 0; index < (nums.length - 1 - i) / 2; index++){
            temp = nums[i + 1 + index];
            nums[i + 1 + index] = nums[nums.length - 1 - index];
            nums[nums.length - 1 - index] = temp;
        }
        
        return;
    }
}