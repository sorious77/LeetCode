class Solution {
    public int[] processQueries(int[] queries, int m) {
        ArrayList<Integer> p = new ArrayList<Integer>();
        
        for(int i=1;i<=m;i++){
            p.add(i);
        }
        
        int []answer = new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
            int temp = p.indexOf(queries[i]);
            answer[i] = temp;
            p.remove(temp);
            p.add(0, queries[i]);
        }
        
        return answer;
    }
}
