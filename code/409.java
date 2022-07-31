class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> alphabetCount = new HashMap<>();
        
        for(char c : s.toCharArray()) {
            alphabetCount.put(c, alphabetCount.getOrDefault(c, 0) + 1);
        }
        
        int answer = 0;
        boolean exsitOneLetter = false;
        for(char c : alphabetCount.keySet()) {
            int count = alphabetCount.get(c);
            
            if(count % 2 == 0) {
                answer += count;
            } else {
                if(exsitOneLetter) {
                    answer += count - 1;
                } else {
                    answer += count;
                    exsitOneLetter = true;
                }
            }
        }
        
        return answer;
    }
}
