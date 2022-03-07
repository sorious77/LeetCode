class Solution {
    int countVowel(String s) {
        int count = 0;
        
        for(char c : s.toCharArray()) {
            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                count++;
        }
        
        return count;
    }
    
    public boolean halvesAreAlike(String s) {
        s = s.toUpperCase();
        
        return countVowel(s.substring(0, s.length() / 2)) == countVowel(s.substring(s.length() / 2));
    }
}
