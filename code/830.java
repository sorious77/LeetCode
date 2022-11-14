class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int n = s.length();
        
        char prev = s.charAt(0);
        int start = 0;
        int end = 0;
        
        List<List<Integer>> answer = new ArrayList<>();
        
        for(int i = 1; i < n; i++) {
            char cur = s.charAt(i);
            
            if(cur != prev) {
                if(end - start >= 2) {
                    List<Integer> list = new ArrayList<>();
                    
                    list.add(start);
                    list.add(end);
                    
                    answer.add(list);
                }
                
                start = i;
            }
            
            end = i;
            prev = cur;
        }
        
        if(end - start >= 2) {
            List<Integer> list = new ArrayList<>();

            list.add(start);
            list.add(end);

            answer.add(list);
        }
        
        return answer;
    }
}
