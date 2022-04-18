class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[][] isExist = new int[3][101];
        
        for(int i = 0; i < nums1.length; i++) {
            isExist[0][nums1[i]] = 1;
        }
        
        for(int i = 0; i < nums2.length; i++) {
            isExist[1][nums2[i]] = 1;
        }
        
        for(int i = 0; i < nums3.length; i++) {
            isExist[2][nums3[i]] = 1;
        }
        
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 1; i <= 100; i++) {
            int count = isExist[0][i] + isExist[1][i] + isExist[2][i];
            
            if(count >= 2) {
                answer.add(i);
            }
        }
        
        return answer;
    }
}
