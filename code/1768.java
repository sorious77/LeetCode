class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int len = word1.length() > word2.length() ? word2.length() : word1.length();
        
        for(int i=0;i<len;i++){
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }
        
        for(int i=len;i<word1.length();i++){
            sb.append(word1.charAt(i));
        }
        for(int i=len;i<word2.length();i++){
            sb.append(word2.charAt(i));
        }
        
        return sb.toString();
    }
}
