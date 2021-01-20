class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer>map = new HashMap<>();
        int answer = 0;
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else
                map.put(nums[i], 1);
            
            if(map.get(nums[i]) > Math.floor((double)nums.length / 2)){
                answer = nums[i];
                break;
            }
        }
        
        return answer;
    }
}
