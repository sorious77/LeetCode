class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < logs.length; i++) {
            Set<Integer> set = map.getOrDefault(logs[i][0], new HashSet<>());
            
            set.add(logs[i][1]);
            
            map.put(logs[i][0], set);
        }
        
        int[] answer = new int[k];
        for(int key : map.keySet()) {
            answer[map.get(key).size() - 1] += 1;
        }
        
        return answer;
    }
}
