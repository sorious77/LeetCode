class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder answer = new StringBuilder();
        
        int length = s.length();
        
        boolean flag = true;
        for(int i = 0; i < length; i += k) {
            if(flag) {
                if(i + k >= length) {
                    answer.append(new StringBuilder(s.substring(i, length)).reverse().toString());
                }
                else {
                    answer.append(new StringBuilder(s.substring(i, i + k)).reverse().toString());
                }
            } else {
                if(i + k >= length) {
                    answer.append(new StringBuilder(s.substring(i, length)).toString());
                }
                else {
                    answer.append(new StringBuilder(s.substring(i, i + k)).toString());
                }
            }
            
            flag = !flag;
        }
        
        return answer.toString();
    }
}
