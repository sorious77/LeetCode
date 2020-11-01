class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList();
        
        if(numRows == 0)
            return answer;
        
        List temp = new ArrayList();
        
        temp.add(1);
        answer.add(temp); // 1
        
        if(numRows == 1)
            return answer;
        
        temp = new ArrayList();
        temp.add(1);
        temp.add(1);
        answer.add(temp); // 2
        
        for(int i=2;i<numRows;i++){
            temp = new ArrayList();
            
            temp.add(1);
            
            for(int j=0;j<i-1;j++){
                temp.add(answer.get(i-1).get(j) + answer.get(i-1).get(j+1));
            }
            
            temp.add(1);
            
            answer.add(temp);
        }
        
        return answer;
    }
}