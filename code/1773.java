class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int targetIdx = -1;
        
        switch(ruleKey) {
            case "type" :
                targetIdx = 0;
                break;
            case "color" :
                targetIdx = 1;
                break;
            case "name" :
                targetIdx = 2;
                break;
        }
        
        Map<String, Integer> map = new HashMap<>();
        
        for(List<String> item : items) {
            String target = item.get(targetIdx);
            
            map.put(target, map.getOrDefault(target, 0) + 1);
        }
        
        return map.getOrDefault(ruleValue, 0);
    }
}
