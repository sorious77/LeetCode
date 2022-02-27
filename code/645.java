class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[10001];
        int max = -1;
        
        for(int num : nums) {
            count[num] += 1;
        }
        
        int[] answer = new int[2];
        
        for(int i = 1; i <= nums.length; i++) {
            if(count[i] == 0) {
                answer[1] = i;
            } else if(count[i] == 2) {
                answer[0] = i;
            }
        }
        
        return answer;
    }
}
