class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count1 = new int[1001];
        int[] count2 = new int[1001];
        
        for(int num : nums1) {
            count1[num] += 1;
        }
        
        for(int num : nums2) {
            count2[num] += 1;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 1000; i++) {
            int min = Math.min(count1[i], count2[i]);     
            
            for(int j = 0; j < min; j++) {
                list.add(i);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
