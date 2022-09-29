class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2) {
            return nums;
        }
        
        int[] answer = new int[2];
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            if(set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        
        Iterator<Integer> iter = set.iterator();
        int idx = 0;
		while(iter.hasNext()) {
            answer[idx++] = iter.next();
		}
        
        return answer;
    }
}
