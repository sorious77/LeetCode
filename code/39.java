class Solution {
    List<List<Integer>> answer;
    
    void dfs(List<Integer> curList, int curSum, int index, int []candidates, int target){
        if(curSum == target){
            List<Integer> list = new ArrayList<>();
            list.addAll(curList);
            answer.add(list);
            
            return;
        }
        
        for(int i=index;i<candidates.length;i++){
            if(curSum + candidates[i] <= target){
                List<Integer> temp = new ArrayList<>();
                temp.addAll(curList);

                temp.add(candidates[i]);
                dfs(temp, curSum + candidates[i], i, candidates, target);
            }
        }
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        answer = new ArrayList<>();
        
        dfs(new ArrayList<Integer>(), 0, 0, candidates, target);
        
        return answer;
    }
}