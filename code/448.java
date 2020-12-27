class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        
        int cur = 1;
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == cur){
                while(i + 1 < nums.length){
                    if(nums[i + 1] == cur)
                        i++;
                    else
                        break;
                }
                cur++;
            }
            else{
                answer.add(cur);
                cur++;
                i--;
            }
        }
        
        for(int i=cur;i<=nums.length;i++){
            answer.add(i);
        }
        
        return answer;
    }
}