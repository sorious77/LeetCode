class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        
        int [][]sum = new int[2][size];
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < size; i++) {
            int curRow = i % 2;
            int prevRow = (i + 1) % 2;
            
            for(int j = 0; j <= i; j++) {
                if(j == 0){
                    sum[curRow][j] = sum[prevRow][j] + triangle.get(i).get(j);
                }
                else if(j == i) {
                    sum[curRow][j] = sum[prevRow][j - 1] + triangle.get(i).get(j);
                } else {
                    sum[curRow][j] = Math.min(sum[prevRow][j], sum[prevRow][j - 1]) + triangle.get(i).get(j);
                }
            }
        }
        
        for(int i = 0; i < size; i++) {
            min = Math.min(min, sum[(size + 1) % 2][i]);
        }
        
        return min;
    }
}