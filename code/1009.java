class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) {
            return 1;
        }
        
        int power = 1;
        int digit = 0;
        
        while(n >= 1) {
            digit += (1 ^ (n % 2)) * power;
            
            power *= 2;
            n /= 2;
        }
        
        return digit;
    }
}
