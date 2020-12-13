class Solution {
    int abs(int a, int b){
        if(a - b < 0)
            return b - a;
        else
            return a - b;
    }
    
    public int threeSumClosest(int[] nums, int target) {
        int temp = 9999999;
        int result = 0;
        
        for(int i=0;i<nums.length - 2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(abs(nums[i] + nums[j] + nums[k], target) < temp){
                    	temp = abs(nums[i] + nums[j] + nums[k], target);
                        result = nums[i] + nums[j] + nums[k];
                    }
                }
            }
        }
        
        return result;
    }
}
