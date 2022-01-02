class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        String ss = "", tt = "";
        
        int backspace = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            
            if(c == '#') {
                backspace++;
            } else {
                if(backspace >= 1) {
                    backspace--;
                } else {
                    sb.append(c);
                }
            }
        }
        ss = sb.toString();
        
        sb = new StringBuilder();
        backspace = 0;
        for(int i = t.length() - 1; i >= 0; i--) {
            char c = t.charAt(i);
            
            if(c == '#') {
                backspace++;
            } else {
                if(backspace >= 1) {
                    backspace--;
                } else {
                    sb.append(c);
                }
            }
        }
        tt = sb.toString();
        
        return ss.equals(tt);
    }
}
