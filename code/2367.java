class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int answer = 0;
        
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                if(nums[j] - nums[i] > diff) {
                    break;
                }
                
                for(int k = j + 1; k < nums.length; k++) {
                    if(nums[k] - nums[j] > diff) {
                        break;
                    }
                    
                    if(nums[k] - nums[j] == diff && nums[j] - nums[i] == diff) {
                        answer += 1;
                    }
                }
            }
        }
        
        return answer;
    }
}
