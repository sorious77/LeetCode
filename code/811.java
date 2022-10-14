import java.util.StringTokenizer;

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap<>();
        
        for(String cpdomain : cpdomains) {
            StringTokenizer st = new StringTokenizer(cpdomain);
            
            int count = Integer.parseInt(st.nextToken());
            String domain = st.nextToken();
            
            counts.put(domain, counts.getOrDefault(domain, 0) + count);
            
            while(true) {
                int idx = domain.indexOf(".");
                
                if(idx == -1) {
                    break;
                }
                
                domain = domain.substring(idx + 1);
                counts.put(domain, counts.getOrDefault(domain, 0) + count);
            }
        }
        
        List<String> answer = new ArrayList<>();
        for(String key : counts.keySet()) {
            answer.add(String.format("%d %s", counts.get(key), key));
        }
        
        return answer;
    }
}
