class Solution {
    List<Integer> arrToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        
        for(int n : array) {
            list.add(n);
        }
        
        return list;
    }
    
    void combination(List<List<Integer>> combinations, int n, int k, int[] combi, int size, int start) {
        if(size == k) {
            combinations.add(arrToList(combi));
            return;
        }
        
        for(int i = start; i <= n; i++) {
            combi[size] = i;
            combination(combinations, n, k, combi, size + 1, i + 1);
        }
    }
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        
        combination(combinations, n, k, new int[k], 0, 1);
        
        return combinations;
    }
}
