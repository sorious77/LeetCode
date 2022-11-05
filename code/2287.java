class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] targetCount = new int[26];
        
        int[] sCount = new int[26];
        
        for(char c : s.toCharArray()) {
            sCount[c - 'a'] += 1;
        }
        
        for(char c : target.toCharArray()) {
            targetCount[c - 'a'] += 1;
        }
        
        int answer = 999999;
        for(int i = 0; i < 26; i++) {
            if(targetCount[i] != 0) {
                answer = Math.min(sCount[i] / targetCount[i], answer);
            }
        }
        
        if(answer == 999999) {
            return 0;
        }
        
        return answer;
    }
}
