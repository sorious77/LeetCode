class Solution {
    public int titleToNumber(String s) {
        int radix = 1;
        int index = 0;
        
        for(int i=s.length()-1;i>=0;i--){
            index += (s.charAt(i) - 'A' + 1) * radix;
            radix *= 26;
        }
        
        return index;
    }
}