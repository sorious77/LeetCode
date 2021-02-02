class Solution {
    public String plusOne(String s){
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        if(s.charAt(s.length()-1) == '1')
            flag = true;
        
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(flag){
                if(ch == '1'){
                    sb.append("0");
                }
                else{
                    flag = false;
                    sb.append("1");
                }
            }
            else{
                sb.append(ch);
            }
        }
        
        if(flag)
            sb.append("1");
        
        return sb.reverse().toString();
    }
    
    public int numSteps(String s) {
        int answer = 0;
        while(s.length() != 1){
            char ch = s.charAt(s.length()-1);
            
            if(ch == '1'){
                s = plusOne(s);            
            }
            else{
                s = s.substring(0, s.length()-1);
            }
            
            answer++;
        }
        return answer;
    }
}
