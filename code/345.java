class Solution {
    boolean isVowel(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
          || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        
        return false;
    }
    
    public String reverseVowels(String s) {
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(isVowel(c)) {
                st.push(c);
            }
        }
        
        char[] str = s.toCharArray();
        
        for(int i = 0; i < str.length; i++) {
            if(isVowel(str[i])) {
                str[i] = st.pop();
            }
        }
        
        return new String(str);
    }
}
