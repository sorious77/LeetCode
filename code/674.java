class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 0;
        int answer = 0;
        
        int prev = Integer.MIN_VALUE;
        for(int num : nums) {
            if(prev < num) {
                count += 1;
            } else {
                count = 1;
            }
            prev = num;
            answer = Math.max(answer, count);
        }
        
        return answer;
    }
}
