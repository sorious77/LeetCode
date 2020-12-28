class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            
            if(cur == 'L'){
                countL++;
            }
            else{
                countL = 0;
                
                if(cur == 'A')
                    countA++;
            }
            
            if(countA >= 2 || countL >= 3)
                return false;
        }
        
        return true;
    }
}