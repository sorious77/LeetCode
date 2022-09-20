class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int length = nums.length;
        
        int[] answer = new int[length];
        
        int left = 0;
        int right = length - 1;
        for(int i = 0; i < length; i++) {
            if(nums[i] < pivot) {
                answer[left++] = nums[i];
            }
            
            if(nums[length - i - 1] > pivot) {
                answer[right--] = nums[length - i - 1];
            }
        }
        
        for(int i = left; i <= right; i++) {
            answer[i] = pivot;
        }
        
        return answer;
    }
}
