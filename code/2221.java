class Solution {
    public int triangularSum(int[] nums) {
        int length = nums.length;
        
        int[][] sum = new int[2][length];
        sum[length % 2] = Arrays.copyOf(nums, length);
        
        for(int i = length - 1; i >= 1; i--) {
            for(int j = 0; j < i; j++) {
                sum[i % 2][j] = (sum[(i + 1) % 2][j] + sum[(i + 1) % 2][j + 1]) % 10;
            }
        }
        
        return sum[1][0];
    }
}
