class Solution {
    boolean isExist(int[] arr, int left, int right, int target) {
        if (left > right) {
            return false;
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] > target) {
            return isExist(arr, left, mid - 1, target);
        } else {
            return isExist(arr, mid + 1, right, target);
        }
    }
    
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if ((arr[i] * -1) % 2 == 0 && isExist(arr, i + 1, arr.length - 1, arr[i] / 2)) {
                    return true;
                }
            } else {
                if (isExist(arr, i + 1, arr.length - 1, arr[i] * 2)) {
                    return true;
                }
            }
        }
            
        return false;
    }
}
