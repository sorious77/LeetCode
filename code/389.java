class Solution {
    public char findTheDifference(String s, String t) {
        int []alphabet = new int[26];
        char answer = 'a';
        
        for(int i=0;i<s.length();i++){
            alphabet[s.charAt(i)-'a']++;
        }       
        
        for(int i=0;i<t.length();i++){
            char temp = t.charAt(i);
            if(alphabet[temp - 'a'] <= 0)
                answer = temp;
            
            alphabet[temp - 'a']--;
        }
        return answer;
    }
}