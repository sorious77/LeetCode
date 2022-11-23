class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double answer = 0;
        
        int prev = 0;
        for(int[] bracket : brackets) {
            if(income == 0) {
                break;
            }
            
            int diff = bracket[0] - prev > income ? income : bracket[0] - prev;
            
            answer += (double)diff * bracket[1] / 100;
            
            prev = bracket[0];
            income -= diff;
        }
        
        return answer;
    }
}
