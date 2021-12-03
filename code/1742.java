class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int max = -1;
        int []count = new int[46];
        
        for(int i=lowLimit; i<=highLimit;i++) {
            int sum = 0;
            int cur = i;
            
            while(cur >= 10) {
                sum += cur % 10;
                cur /= 10;
            }
            sum += cur;
            
            count[sum]++;
            
            max = Math.max(max, count[sum]);
        }
                
        return max;
    }
}