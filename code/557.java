import java.util.StringTokenizer;

class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        
        while(st.hasMoreTokens()) {
            reverse = new StringBuilder(st.nextToken());
            
            sb.append(reverse.reverse().toString()).append(" ");
        }
        
        String answer = sb.toString();
        
        return answer.substring(0, answer.length() - 1);
    }
}
