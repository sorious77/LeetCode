class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0)
            return 0;
        
        int temp = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                if(count != 0)
                    temp = count;
                count = 0;
            }
            else
                count++;
        }
        if(count == 0)
            count = temp;
        
        return count;
    }
}