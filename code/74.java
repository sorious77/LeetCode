class Solution {
    boolean search(int []array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            
            if(array[mid] == target){
                return true;
            } else if(array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i = 0; i < m; i++) {
            if(matrix[i][0] <= target && target <= matrix[i][n - 1]) {
                return search(matrix[i], target);
            }
        }
        
        return false;
    }
}