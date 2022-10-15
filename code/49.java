class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String str : strs) {
            int[] count = new int[26];
            
            for(char c : str.toCharArray()) {
                count[c - 'a'] += 1;
            }
            
            String key = Arrays.toString(count);
            
            if(map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                
                map.put(key, list);
            }
        }
        
        List<List<String>> answer = new ArrayList<>();
        for(String key : map.keySet()) {
            answer.add(map.get(key));
        }
        
        return answer;
    }
}
