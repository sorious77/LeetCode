class Solution {
    public String countAndSay(int n) {        
        if(n == 1)
            return "1";
        
        String answer = "11";
        
        for(int i=3;i<=n;i++){
            String temp = "";
            
            char curChar = answer.charAt(0);
            int count = 1;
            
            for(int j=1;j<answer.length();j++){
                if(curChar == answer.charAt(j)){
                    count++;
                }
                else{
                    temp += Integer.toString(count) + curChar;
                    curChar = answer.charAt(j);
                    count = 1;
                }
            }
            
            temp += Integer.toString(count) + curChar;
            
            answer = temp;
        }
        
        return answer;
    }
}