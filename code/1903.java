class Solution {
    public String largestOddNumber(String num) {
        int lastOddIdx = -1;
        
        for(int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            
            if((c - '0') % 2 == 1) {
                lastOddIdx = i;
                break;
            }
        }
        
        if(lastOddIdx == -1) {
            return "";
        } else {
            return num.substring(0, lastOddIdx + 1);
        }
    }
}
