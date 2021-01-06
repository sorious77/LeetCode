class Solution {
    public String freqAlphabets(String s) {
        String temp = "";
        String answer = "";
        
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            int num = 0;
            
            if(ch == '#'){
                temp = s.substring(i-2, i);
                num = Integer.parseInt(temp);
                ch = (char)(num + (int)'a' - 1);
                i -= 2;
            }
            else{
                ch = (char)(((int)ch - '0') + (int)'a' - 1);
            }
            answer = Character.toString(ch).concat(answer);
        }
        
        return answer;
    }
}