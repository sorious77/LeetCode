class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> array = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
           array.add(index[i], nums[i]); 
        }
        
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            answer[i] = array.get(i);
        }
        
        return answer;
    }
}
