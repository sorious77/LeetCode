class Solution {
    int findMinDel(int length, int smallIdx, int bigIdx) {
        int result = 9999999;
        
        result = Math.min(result, bigIdx + 1);
        result = Math.min(result, length - smallIdx);
        result = Math.min(result, smallIdx + 1 + length - bigIdx);
        
        return result;
    }
    
    public int minimumDeletions(int[] nums) {
        int length = nums.length;
        
        if(length <= 2){
            return length;
        }
        
        int max = nums[0];
        int min = nums[0];
        
        int maxIdx = 0, minIdx = 0;
        
        for(int i = 0; i < length; i++) {
            if(max < nums[i]) {
                max = nums[i];
                maxIdx = i;
            }
            if(min > nums[i]) {
                min = nums[i];
                minIdx = i;
            }
        }
        
        int smallIdx = Math.min(minIdx, maxIdx);
        int bigIdx = Math.max(minIdx, maxIdx);
        
        int answer = findMinDel(length, smallIdx, bigIdx);
        
        return answer;
    }
}
