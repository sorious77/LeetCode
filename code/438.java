class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> answer = new ArrayList<>();
        
        if(s.length() < p.length()) {
            return new ArrayList<>();
        }
        
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        
        for(int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a'] += 1;
            sCount[s.charAt(i) - 'a'] += 1;
        }
        
        if(isAnagram(sCount, pCount)) {
            answer.add(0);
        }
        
        for(int i = p.length(); i < s.length(); i++) {
            sCount[s.charAt(i - p.length()) - 'a'] -= 1;
            sCount[s.charAt(i) - 'a'] += 1;
            
            if(isAnagram(sCount, pCount)) {
                answer.add(i - p.length() + 1);
            }
        }
        
        return answer;
    }
    
    boolean isAnagram(int[] sCount, int[] pCount) {
        for(int i = 0; i < 26; i++) {
            if(sCount[i] != pCount[i]) {
                return false;
            }
        }
        
        return true;
    }
}
