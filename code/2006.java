class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int diff = Math.abs(nums[i] - nums[j]);
                
                if(diff == k) {
                    count += 1;
                } else if(diff > k) {
                    break;
                }
            }
        }
        
        return count;
    }
}
