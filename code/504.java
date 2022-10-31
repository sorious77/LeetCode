class Solution {
    public String convertToBase7(int num) {
        if(num == 0) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        
        boolean isMinus = num < 0;
        
        if(num < 0) {
            num *= -1;
        }
        
        while(num > 0) {
            sb.append(num % 7);
            num /= 7;
        }
        
        String answer = sb.reverse().toString();
        
        if(isMinus) {
            return "-".concat(answer);
        }
        
        return answer;
    }
}
