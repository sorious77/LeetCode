class Solution {
    boolean isCap(char c){
        if('A' <= c && c <= 'Z')
            return true;
        
        return false;
    }
    
    public boolean detectCapitalUse(String word) {
        if(word.length() <= 1)
            return true;
        
        boolean zero = isCap(word.charAt(0));
        boolean first = isCap(word.charAt(1));
        boolean answer = true;
        
        if(!zero && first) // 첫번째가 소문자, 두번째가 대문자인 경우
            return false;
        
        for(int i=2;i<word.length();i++){
            char ch = word.charAt(i);
            boolean flag = isCap(ch);
            
            if(zero){ // 첫번째가 대문자
                if(first != flag){ // 두번째와 다르면 false
                    answer = false;
                    break;
                }
            }
            else{ // 첫번째가 소문자
                if(flag){ // 대문자가 나오면 false
                    answer = false;
                    break;
                }
            }
        }
        
        return answer;
    }
}
