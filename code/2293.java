class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        
        int length = nums.length;
        int[] newNums = new int[length / 2];
        
        for(int i = 0; i < length / 2; i++) {
            if(i % 2 == 0) {
                newNums[i] = Math.min(nums[i * 2], nums[(i * 2) + 1]);
            } else {
                newNums[i] = Math.max(nums[i * 2], nums[(i * 2) + 1]);
            }
        }
        
        return minMaxGame(newNums);
    }
}
