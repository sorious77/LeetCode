class Solution {
    public int subtractProductAndSum(int n) {
        String num = Integer.toString(n);
        int sum = 0;
        int product = 1;
        
        for(int i=0;i<num.length();i++){
            int temp = num.charAt(i) - '0';
            
            sum += temp;
            product *= temp;
        }
        
        return product - sum;
    }
}
