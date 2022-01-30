class Solution {
    public int findComplement(int num) {
        if(num == 0) {
            return 1;
        }
        
        int power = 1;
        int digit = 0;
        
        while(num >= 1) {
            digit += (1 ^ (num % 2)) * power;
            
            power *= 2;
            num /= 2;
        }
        
        return digit;
    }
}
