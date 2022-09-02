class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        
        int[] copy = new int[length * 2];
        
        for(int i = 0; i < length; i++) {
            copy[i] = nums[i];
            copy[i + length] = nums[i];
        }
        
        return copy;
    }
}
