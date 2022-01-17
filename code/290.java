import java.util.StringTokenizer;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(s);
        
        int length = pattern.length();
        
        for(int i = 0; i < length; i++) {
            if(!st.hasMoreTokens()) {
                return false;
            }
            
            String str = st.nextToken();
            char c = pattern.charAt(i);
            
            if(map.isEmpty()) {
                map.put(c, str);
                reverseMap.put(str, c);
            } else {
                if(map.containsKey(c)) {
                    if(!map.get(c).equals(str)) {
                        return false;
                    }
                } else {
                    if(reverseMap.containsKey(str)) {
                        if(reverseMap.get(str) != c)
                            return false;
                    }
                    map.put(c, str);
                }
            }
        }
        
        if(st.hasMoreTokens())
            return false;
        
        return true;
    }
}
