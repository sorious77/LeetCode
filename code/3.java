class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        
        String temp = "";
        int answer = 1;
        
        temp = Character.toString(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            if(temp.indexOf(s.charAt(i)) == -1){
                temp = temp.concat(Character.toString(s.charAt(i)));
                
                if(answer < temp.length())
                    answer = temp.length();
            }
            else{
                temp = temp.substring(temp.indexOf(s.charAt(i)) + 1);
                temp = temp.concat(Character.toString(s.charAt(i)));
            }
        }   
        
        return answer;
    }
}