class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        
        int length = nums.length;
        
        int answer = 0;
        
        for(int i = length - 1; i >= 2; i--) {
            for(int j = i - 1; j >= 1; j--) {
                if(nums[j] * 2 < nums[i]) {
                    break;
                }
                
                for(int k = j - 1; k >= 0; k--) {
                    if(nums[k] + nums[j] > nums[i]) {
                        answer += 1;
                    } else {
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}
