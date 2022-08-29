class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i = words.length - 1; i >= 0; i--) {
            if(" ".startsWith(words[i]))
                continue;
            
            sb.append(words[i]).append(" ");
        }
        
        return sb.substring(0, sb.length() - 1).toString();
    }
}
