class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int num : nums1) {
            set1.add(num);
        }
        
        for(int num : nums2) {
            set2.add(num);
        }
        
        List<Integer> nums = new ArrayList<>();
        Iterator iter = set1.iterator();
        
        while(iter.hasNext()) {
            int num = (Integer)iter.next();
            
            if(set2.contains(num)) {
                nums.add(num);
            }
        }
        
        int[] answer = new int[nums.size()];
        
        for(int i = 0; i < nums.size(); i++) {
            answer[i] = nums.get(i);
        }
        
        return answer;
    }
}
