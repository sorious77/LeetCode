class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int count = map.get(num);
                map.put(num, count + 1);
            }
        }
        
        List<Integer> sorted = new ArrayList<>(map.keySet());
        
        sorted.sort((n1, n2) -> map.get(n2) - map.get(n1));
        
        int []answer = new int[k];
        for(int i=0;i<k;i++){
            answer[i] = sorted.get(i);
        }
        
        return answer;
    }
}