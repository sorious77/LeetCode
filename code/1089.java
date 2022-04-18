class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                int end = arr.length - 1;
                
                while(end > i) {
                    arr[end] = arr[end - 1];
                    end -= 1;
                }
                
                i += 1;
            }
        }
    }
}
