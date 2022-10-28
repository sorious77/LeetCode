class Solution {
    public List<String> commonChars(String[] words) {
        int n = words.length;
        
        int[][] count = new int[n][26];
        
        for(int i = 0; i < n; i++) {
            for(char c : words[i].toCharArray()) {
                count[i][c - 'a'] += 1;   
            }
        }
        
        List<String> answer = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
            int min = count[0][i];
            
            for(int j = 0; j < n; j++) {
                min = Math.min(min, count[j][i]);
            }
            
            char c = (char)(i + 'a');
            for(int j = 0; j < min; j++) {
                answer.add(Character.toString(c));
            }
        }
        
        return answer;
    }
}
