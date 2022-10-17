class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] exists = new boolean[26];
        
        for(char c : sentence.toCharArray()) {
            exists[c - 'a'] = true;
        }
        
        for(boolean exist : exists) {
            if(!exist) {
                return false;
            }
        }
        
        return true;
    }
}
