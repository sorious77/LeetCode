class Solution {
    public int minimumSum(int num) {
        int[] nums = new int[4];
        
        for(int i = 0; i < 4; i++) {
            nums[i] = num % 10;
            num /= 10;
        }
        
        Arrays.sort(nums);
        
        return (nums[0] + nums[1]) * 10 + nums[2] + nums[3];
    }
}
