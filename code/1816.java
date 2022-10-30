class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < k - 1; i++) {
            answer.append(words[i]).append(" ");
        }
        
        answer.append(words[k - 1]);
                
        return answer.toString();
    }
}
