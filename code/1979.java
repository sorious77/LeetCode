class Solution {
    int getGCD(int a, int b) {
        while(true) {
            if(a % b == 0) {
                return b;
            }
            
            int temp = b;
            b = a % b;
            a = temp;
        }
    }
    
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
                    
        return getGCD(nums[0], nums[nums.length - 1]);
    }
}