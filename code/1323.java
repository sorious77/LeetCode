class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        boolean flag = false;
        int answer = 0;
        
        for(int i=0;i<s.length();i++){
            if(!flag){
                if(s.charAt(i) == '6'){
                    answer = answer * 10 + 9;
                    flag = true;
                }
                else{
                    answer = answer * 10 + (s.charAt(i) - '0');
                }
            }
            else{
                answer = answer * 10 + (s.charAt(i) - '0');   
            }
        }
        
        return answer;
    }
}
