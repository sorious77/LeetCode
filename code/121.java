class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int price : prices) {
            if(price < min) {
                min = price;
            }
            
            answer = Math.max(answer, price - min);
        }
        
        return answer;
    }
}
