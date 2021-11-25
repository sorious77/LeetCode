class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int answer = 0;
        
        for(String op : operations){
            if(op.contains("+"))
                answer++;
            else
                answer--;
        }
        
        return answer;
    }
}