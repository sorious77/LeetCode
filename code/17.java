class Solution {
    public List<String> letterCombinations(String digits) {
        int []index = {3,3,3,3,3,4,3,4};
        char []alphabet = {'a','d','g','j','m','p','t','w'};
                
        List<String> answer = new ArrayList();
        
        if(digits.isEmpty())
            return answer;
        
        Queue<String> q = new LinkedList<String>();
        
        q.offer("");
        
        for(int i=0;i<digits.length();i++){
            int size = q.size();
            char cur = alphabet[digits.charAt(i) - '0' - 2];
            
            for(int j=0;j<size;j++){
                String temp = q.poll();
                
                for(int k=0;k<index[digits.charAt(i) - '0' - 2];k++){
                    q.offer(temp + Character.toString((char)alphabet[digits.charAt(i) - '0' - 2] + k));
                }
            }
        }
        
        while(!q.isEmpty()){
            answer.add(q.poll());
        }
        
        return answer;
    }
}