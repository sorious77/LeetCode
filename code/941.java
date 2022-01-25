class Solution {
    public boolean validMountainArray(int[] arr) {
        int length = arr.length;
        
        if(length < 3 || arr[0] > arr[1]) {
            return false;
        }
        
        boolean isIncreasing = true;
        int prev = arr[0];
        
        for(int i = 1; i < length; i++) {
            if(isIncreasing) {
                if(prev > arr[i]) {
                    isIncreasing = false;
                } else if(prev == arr[i]) {
                    return false;
                }
            } else {
                if(prev <= arr[i]) {
                    return false;
                }
            }
            
            prev = arr[i];
        }
        
        if(isIncreasing)
            return false;
        
        return true;
    }
}
