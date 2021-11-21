class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> answer = new ArrayList<>();
        
        for(int i=1;i<=1000;i++){
            if(customfunction.f(i, 1) > z){
                    break;
            }
            
            for(int j=1;j<=1000;j++){
                if(customfunction.f(i, j) == z){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    answer.add(temp);
                    break;
                }
            }
        }
        
        return answer;
    }
}
