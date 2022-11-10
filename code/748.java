class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] count = new int[26];
        
        licensePlate = licensePlate.toLowerCase();
        for(char c : licensePlate.toCharArray()) {
            if(Character.isLowerCase(c)) {
                count[c - 'a'] += 1;
            }
        }
        
        String answer = "";
        for(String word : words) {
            int[] wordCount = new int[26];
            
            for(char c : word.toCharArray()) {
                wordCount[c - 'a'] += 1;
            }
            
            boolean isComplete = true;
            for(int i = 0; i < 26; i++) {
                if(count[i] > 0 && count[i] > wordCount[i]) {
                    isComplete = false;
                    break;
                }
            }
            
            if(isComplete) {
                if(answer.length() > word.length() || "".equals(answer)) {
                    answer = word;
                }
            }
        }
        
        return answer;
    }
}
