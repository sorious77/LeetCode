class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) {
            return false;
        }
        
        int []count = new int[26];
        int []compare = new int[26];
        
        for(int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            compare[s2.charAt(i) - 'a']++;
        }
        
        if(Arrays.equals(count, compare))
            return true;
        
        for(int i = s1.length(); i < s2.length(); i++) {            
            compare[s2.charAt(i - s1.length()) - 'a']--;
            compare[s2.charAt(i) - 'a']++;
            
            if(Arrays.equals(count, compare))
                return true;
        }
        
        return false;
    }
}
