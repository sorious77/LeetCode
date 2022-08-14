class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> answer = new ArrayList<>();
        
        int minIndexSum = 999999;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        
        for(int i = 0; i < list2.length; i++) {
            String s = list2[i];
            
            if(map.containsKey(s)) {
                int indexSum = i + map.get(s);
                
                if(indexSum < minIndexSum) {
                    minIndexSum = indexSum;
                    answer.clear();
                    answer.add(s);
                } else if(indexSum == minIndexSum) {
                    answer.add(s);
                }
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}
