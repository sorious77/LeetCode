class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        
        String[] answer = new String[10];
        
        StringBuilder sb = new StringBuilder();
        
        for(String word : words) {
            int length = word.length();
            
            answer[word.charAt(length - 1) - '0'] = word.substring(0, length - 1);
        }
        
        for(int i = 0; i < 10; i++) {
            if(!"".equals(answer[i]) && answer[i] != null) {
                sb.append(answer[i]).append(" ");
            }
        }
        
        return sb.toString().substring(0, sb.length() - 1);
    }
}
