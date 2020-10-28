class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m - 1;
        
        // solve with using insertion sort
        for(int i=0;i<n;i++,m++){ // m : nums1.length
            index = -1;   
        
            for(int j=m-1;j>=0;j--){
                if(nums2[i] < nums1[j]){
                    index = j;
                }
            }
            
            if(index == -1){
                nums1[m] = nums2[i];
            }
            else{
                for(int j=m;j>index;j--){
                    nums1[j] = nums1[j-1];
                }
            
                nums1[index] = nums2[i];
            }
        }
    }
}