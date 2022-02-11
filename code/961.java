class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            
            if(map.get(num) == (length / 2)) {
                return num;
            }
        }
        
        return -1;
    }
}
