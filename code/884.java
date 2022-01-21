import java.util.StringTokenizer;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> answer = new ArrayList<>();
        
        StringTokenizer st = new StringTokenizer(s1);
        
        while(st.hasMoreTokens()) {
            String s = st.nextToken();
            
            if(map.size() == 0) {
                map.put(s, 1);
            } else {
                if(map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        }
        
        st = new StringTokenizer(s2);
        
        while(st.hasMoreTokens()) {
            String s = st.nextToken();
            
            if(map.size() == 0) {
                map.put(s, 1);
            } else {
                if(map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        }
        
        Iterator<String> keys = map.keySet().iterator();
        
        while(keys.hasNext()) {
            String key = keys.next();
            int count = map.get(key);
            
            if(count == 1) {
                answer.add(key);
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}
