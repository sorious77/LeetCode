class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1, len2;
        
        len1 = nums1.length;
        len2 = nums2.length;
        
        int []mergedArray = new int[len1 + len2];
        
        int index1 = 0, index2 = 0;
        int index = 0;
        
        while(index1 < len1 && index2 < len2){
            if(nums1[index1] > nums2[index2]){
                mergedArray[index] = nums2[index2];
                index2++;
                index++;
            }
            else{
                mergedArray[index] = nums1[index1];
                index1++;
                index++;
            }
        }
    
        while(index1 < len1){
            mergedArray[index] = nums1[index1];
            index++;
            index1++;
        }
    
        while(index2 < len2){
            mergedArray[index] = nums2[index2];
            index++;
            index2++;
        }
        
        if((len1 + len2) % 2 == 0){
            return (mergedArray[(len1+len2)/2-1] + mergedArray[(len1+len2)/2])/2.0;
        }
        else
            return mergedArray[(len1+len2)/2];
    }
}