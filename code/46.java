class Solution {
    List<List<Integer>> answer;
    boolean []visit;
    
    void dfs(List<Integer> li, int []nums){
        if(!li.isEmpty()){
            if(li.size() == nums.length){
                List<Integer> copy = new ArrayList(li);
                answer.add(copy);
                return;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(!visit[i]){
                visit[i] = true;
                li.add(nums[i]);
                dfs(li, nums);
                li.remove(li.size() - 1);
                visit[i] = false;
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        visit = new boolean[nums.length];
        List<Integer> li = new ArrayList();
        answer = new ArrayList();
        dfs(li, nums);
        
        return answer;
    }
}