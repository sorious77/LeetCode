class Solution {
    public int numSquares(int n) {
        int []count = new int[10001];
        
        Arrays.fill(count, 999999);
        
        for(int i = 1; i <= n; i++) {
            if(i * i <= 10000){
                count[i * i] = 1;
            }
            
            for(int j = 1; i - j * j > 0; j++) {
                count[i] = Math.min(count[i], count[i - j * j] + 1);
            }
        }
        
        return count[n];
    }
}