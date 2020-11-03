class Solution {
    boolean isPalin(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        }
        
        return true;
    }
    
    public String longestPalindrome(String s) {
        String temp = "";
        String answer = Character.toString(s.charAt(0));
        
        for(int i=0;i<s.length();i++){
            temp = "";
            
            temp = temp.concat(Character.toString(s.charAt(i)));
            
            for(int j=i+1;j<s.length();j++){
                temp = temp.concat(Character.toString(s.charAt(j)));
                
                if(s.charAt(i) == s.charAt(j)){
                    if(isPalin(temp)){
                        if(answer.length() < temp.length())
                            answer = temp;
                    }
                }
            }
            
            if(answer.length() > s.length() - i)
                break;
        }
        
        return answer;
    }
}