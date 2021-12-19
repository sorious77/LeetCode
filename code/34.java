class Solution {
    int findFirst(int []nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int first = Integer.MAX_VALUE;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            
            if(nums[mid] == target) {
                first = Math.min(first, mid);
                
                right = mid - 1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if(first == Integer.MAX_VALUE)
            return -1;
        else
            return first;
    }
    
    int findLast(int []nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int last = Integer.MIN_VALUE;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            
            if(nums[mid] == target) {
                last = Math.max(last, mid);
                
                left = mid + 1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if(last == Integer.MIN_VALUE)
            return -1;
        else
            return last;
    }
    
    public int[] searchRange(int[] nums, int target) {        
        int[] answer = new int[2];
        
        answer[0] = findFirst(nums, target);
        answer[1] = findLast(nums, target);
        
        return answer;
    }
}
