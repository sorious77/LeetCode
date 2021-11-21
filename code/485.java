class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0;
        int count = 0;
        int i, j;
        for(i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count = 0;
                for(j=i;j<nums.length;j++){
                    if(nums[j] != 1){
                        break;
                    }
                    count++;
                }
                i = j;
                
                answer = Math.max(answer, count);
            }
        }
        
        return answer;
    }
}
