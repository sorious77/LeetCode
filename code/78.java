class Solution {
    Set<List<Integer>> set = new HashSet<>();
    
    void makeSubset(int[] nums, boolean[] check, int idx) {
        int length = nums.length;
        
        if(idx >= length) {
            List<Integer> list = new ArrayList<>();
        
            for(int i = 0; i < length; i++) {
                if(check[i]) {
                    list.add(nums[i]);
                }
            }

            set.add(list);
            
            return;
        }
        
        makeSubset(nums, check, idx + 1);
        check[idx] = true;
        makeSubset(nums, check, idx + 1);
        check[idx] = false;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        makeSubset(nums, new boolean[nums.length], 0);
        
        return new ArrayList(set);
    }
}
