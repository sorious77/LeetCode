import java.util.StringTokenizer;

class Solution {
    public int countSegments(String s) {
        StringTokenizer st = new StringTokenizer(s);
        
        int count = 0;
        while(st.hasMoreTokens()) {
            count += 1;
            st.nextToken();
        }
        
        return count;
    }
}
