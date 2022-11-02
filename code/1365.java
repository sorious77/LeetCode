class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        
        Arrays.sort(copy);
        
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!count.containsKey(copy[i])) {
                count.put(copy[i], i);
            }
        }
        
        int[] answer = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            answer[i] = count.get(nums[i]);
        }
        
        return answer;
    }
}
