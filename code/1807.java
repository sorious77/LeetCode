class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        
        knowledge.stream().forEach(know -> map.put(know.get(0), know.get(1)));
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(c == '(') {
                int close = s.indexOf(")", i);
                
                String key = s.substring(i + 1, close);
                
                if(map.containsKey(key)) {
                    sb.append(map.get(key));
                } else {
                    sb.append("?");
                }
                
                i += key.length() + 1;
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}