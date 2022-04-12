class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveDolar = 0;
        int tenDolar = 0;
        
        for(int bill : bills) {
            if(bill == 5) {
                fiveDolar += 1;
            } else if(bill == 10) {
                fiveDolar -= 1;
                tenDolar += 1;
            } else {
                if(tenDolar >= 1) {
                    tenDolar -= 1;
                    fiveDolar -= 1;
                } else {
                    fiveDolar -= 3;
                }
            }
            
            if(fiveDolar < 0 || tenDolar < 0) {
                return false;
            }
        }
        
        return true;
    }
}
