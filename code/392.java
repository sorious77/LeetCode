class Solution {
    public int findIndex(char c, String t, int index){        
        for(int i=index;i<t.length();i++){
            if(t.charAt(i) == c)
                return i;
        }
        
        return -1;
    }
    
    public boolean isSubsequence(String s, String t) {
        int tIndex = 0;
        for(int i=0;i<s.length();i++){
            tIndex = findIndex(s.charAt(i), t, tIndex);
            
            if(tIndex == -1)
                return false;
            
            tIndex++;
        }
        
        return true;
    }
}