class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "").toUpperCase();
        
        int length = s.length();
        
        int left = length % k;
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(s.substring(0, left));
        
        for(int i = 0; i < length / k; i++) {
            int start = i * k + left;
            int end = (i + 1) * k + left;
            
            sb.append("-").append(s.substring(start, end));
        }
        
        String answer = sb.toString();
        
        if(answer.length() > 0 && answer.charAt(0) == '-') {
            answer = answer.substring(1);
        }
        
        return answer;
    }
}
