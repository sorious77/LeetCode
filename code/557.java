class Solution {
    public String reverseWords(String s) {
        String temp = "";
        String answer = "";
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                answer += temp + " ";
                temp = "";
            }
            else{
                temp = s.charAt(i) + temp;
            }
        }
        
        answer += temp;
        
        return answer;
    }
}