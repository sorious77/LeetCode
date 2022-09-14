class Solution {
    public int partitionString(String s) {
        boolean[] alphabet = new boolean[26];
        int answer = 1;
        
        for(char c : s.toCharArray()) {
            int idx = c - 'a';
            
            if(alphabet[idx]) {
                answer += 1;
                Arrays.fill(alphabet, false);
            }
            
            alphabet[idx] = true;
        }
        
        return answer;
    }
}
