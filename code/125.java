class Solution {
    public boolean isPalindrome(String s) {
        String temp = "";
        
        for(int i=0;i<s.length();i++){
            if(('a' <= s.charAt(i) && s.charAt(i) <= 'z') || ('0' <= s.charAt(i) && s.charAt(i) <= '9')){
                temp += s.charAt(i);
            }
            else if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                temp += Character.toLowerCase(s.charAt(i));
            }
        }
        
        for(int i=0;i<temp.length()/2;i++){
            if(temp.charAt(i) != temp.charAt(temp.length()-i-1)){
                return false;
            }
        }
        
        return true;
    }
}