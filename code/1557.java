class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] count = new int[n];
        
        for(List<Integer> edge : edges) {
            int start = edge.get(0);
            int end = edge.get(1);
            
            count[end] += 1;
        }
        
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(count[i] == 0) {
                answer.add(i);
            }
        }
        
        return answer;
    }
}
