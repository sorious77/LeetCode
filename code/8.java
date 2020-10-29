class Solution {
    boolean isDigit(char c){
        if('0' <= c && c <= '9')
            return true;
    
        return false;
    }
    
    public int myAtoi(String s) {
        if(s == "")
            return 0;
        
        int firstLetterIndex = -1;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                firstLetterIndex = i;
                break;
            }
        }
        
        if(firstLetterIndex == -1)
            return 0;
        
        String answer = "";
        
        if(isDigit(s.charAt(firstLetterIndex)) || s.charAt(firstLetterIndex) == '-' || s.charAt(firstLetterIndex) == '+'){
            int index = firstLetterIndex;
            
            answer += s.charAt(index);
            index++;
            
            for(;index < s.length();index++){
                if(isDigit(s.charAt(index)) == true){
                    answer += s.charAt(index);
                }
                else
                    break;
            }
            
            if(answer.equals("+") || answer.equals("-"))
                return 0;
            
            try{
                return Integer.parseInt(answer);
            }catch(NumberFormatException e){
                if(answer.charAt(0) == '-')
                    return Integer.MIN_VALUE;
                else
                    return Integer.MAX_VALUE;
            }
        }
        else
            return 0;
    }
}