class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i] < prices[j]){
                    if(answer < prices[j] - prices[i])
                        answer = prices[j] - prices[i];
                }
            }
        }
        
        return answer;
    }
}