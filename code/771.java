class Solution {
    boolean isUpper(char c){
        if('A' <= c && c <= 'Z')
            return true;
        return false;
    }
    
    public int numJewelsInStones(String jewels, String stones) {
        boolean []upper = new boolean[26];
        boolean []lower = new boolean[26];
        char ch;
        int answer = 0;
        
        for(int i=0;i<jewels.length();i++){
            ch = jewels.charAt(i);
            
            if(isUpper(ch)){
                upper[ch - 'A'] = true;
            }
            else{
                lower[ch - 'a'] = true;
            }
        }
        
        for(int i=0;i<stones.length();i++){
            ch = stones.charAt(i);
            
            if(isUpper(ch)){
                if(upper[ch - 'A'])
                    answer++;
            }
            else{
                if(lower[ch - 'a'])
                    answer++;
            }
        }
        
        return answer;
    }
}
