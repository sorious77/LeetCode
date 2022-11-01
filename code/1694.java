class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : number.toCharArray()) {
            if(c != ' ' && c != '-') {
                sb.append(c);
            }
        }
        
        StringBuilder answer = new StringBuilder();
        
        int idx = 0;
        int length = sb.length();
        
        while(length > 4) {
            answer.append(sb.substring(idx, idx + 3)).append("-");
            
            idx += 3;
            length -= 3;
        }
        
        if(length == 4) {            
            answer.append(sb.substring(idx, idx + 2)).append("-").append(sb.substring(idx + 2, idx + 4));
        } else {
            answer.append(sb.substring(idx, idx + length));
        }
        
        return answer.toString();
    }
}
