class Solution {
    public int missingNumber(int[] nums) {
        int last = nums.length;
        int sum = 0;
        
        for(int i = 1; i <= last; i++) {
            sum += i;
        }
        
        for(int num : nums) {
            sum -= num;
        }
        
        return sum;
    }
}
