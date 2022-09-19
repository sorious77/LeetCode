import java.util.*;

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String path : paths) {
            StringTokenizer st = new StringTokenizer(path);
            
            String directory = st.nextToken();
            
            while(st.hasMoreTokens()) {
                String file = st.nextToken();
                
                int open = file.indexOf('(');
                String text = file.substring(open + 1, file.length());
                
                if(map.containsKey(text)) {
                    map.get(text).add(new StringBuilder(directory).append("/").append(file.substring(0, open)).toString());
                } else {
                    List<String> list = new ArrayList<>();
                    list.add(new StringBuilder(directory).append("/").append(file.substring(0, open)).toString());
                    
                    map.put(text, list);
                }
            }
        }
        
        List<List<String>> answer = new ArrayList<>();
        for(String key : map.keySet()) {
            List<String> list = map.get(key);
            
            if(list.size() > 1)
                answer.add(map.get(key));
        }
        
        return answer;
    }
}
