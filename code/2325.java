class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> secretKey = new HashMap<>();
        
        int idx = 0;
        for(char c : key.toCharArray()) {
            if(c == ' ') {
                continue;
            }
            
            if(!secretKey.containsKey(c)) {
                secretKey.put(c, (char)('a' + idx));
                
                idx += 1;
            }
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(char c : message.toCharArray()) {
            if(c == ' ') {
                answer.append(' ');
                continue;
            }
            
            answer.append(secretKey.get(c));
        }
        
        return answer.toString();
    }
}
