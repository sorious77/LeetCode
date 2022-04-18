class Solution {
    public boolean checkRecord(String s) {
        boolean isLate = false;
        int consecutiveLate = 0;
        int countAbsent = 0;
        
        for(char c : s.toCharArray()) {
            if(c == 'A') {
                countAbsent += 1;
                isLate = false;
                
                if(countAbsent >= 2) {
                    return false;
                }
            } else if(c == 'L') {
                if(isLate) {
                    consecutiveLate += 1;
                    
                    if(consecutiveLate >= 3) {
                        return false;
                    }
                } else {
                    isLate = true;
                    consecutiveLate = 1;
                }
            } else {
                isLate = false;
            }
        }
        
        return true;
    }
}
