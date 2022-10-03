class Solution {
    public int mostWordsFound(String[] sentences) {
        int answer = 0;
        
        for(String sentence : sentences) {
            String[] splitSentence = sentence.split(" ");
            
            answer = Math.max(answer, splitSentence.length);
        }
        
        return answer;
    }
}
